package javax.edi.bind.util;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.edi.bind.annotations.elements.EDIElementFormats;
import javax.edi.bind.annotations.elements.EDILocale;
import javax.edi.bind.annotations.elements.EDITimezone;

import org.apache.commons.convert.ConversionException;
import org.apache.commons.convert.Converter;
import org.apache.commons.convert.Converters;
import org.apache.commons.convert.DateTimeConverters.DateToString;
import org.apache.commons.convert.DateTimeConverters.StringToDate;
import org.apache.commons.convert.NumberConverters.AbstractNumberConverter;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FieldAwareConverter {
	private static final Logger LOG = LoggerFactory.getLogger(FieldAwareConverter.class);
	
	public static <T> String convertToString(Field field, T obj) throws ConversionException, ClassNotFoundException {
		if (obj == null) {
			return null;
		}

		List<String> formats = new ArrayList<String>();
		Locale locale = null;
		TimeZone timezone = null;
		
		if(field.isAnnotationPresent(EDIElementFormats.class)) {
			EDIElementFormats formatsAnnotation = field.getAnnotation(EDIElementFormats.class);
			EDIElementFormat[] elementFormats = formatsAnnotation.value();
			for (int i = 0; i < elementFormats.length; i++) {
				if (elementFormats[i].value() != null) {
					formats.add(elementFormats[i].value());
				}
			}
		}
		if(field.isAnnotationPresent(EDIElementFormat.class)) {
			EDIElementFormat formatAnnotation = field.getAnnotation(EDIElementFormat.class);
			String format = formatAnnotation.value();
			if (format != null) {
				formats.add(format);
			}
		}
		
		if(field.isAnnotationPresent(EDILocale.class)) {
			EDILocale localeAnnotation = field.getAnnotation(EDILocale.class);
			locale = new Locale(localeAnnotation.language(), localeAnnotation.region());
		}
		else {	
			locale = Locale.getDefault();
		}
		 
		if(field.isAnnotationPresent(EDITimezone.class)) {
			EDITimezone timezoneAnnotation = field.getAnnotation(EDITimezone.class);
			timezone = TimeZone.getTimeZone(timezoneAnnotation.timezone());
		}
		else {
			timezone = TimeZone.getDefault();
		}
		
		
		Converter converter = Converters.getConverter(obj.getClass(), String.class);
		
		if(converter instanceof AbstractNumberConverter) {
			if(obj instanceof Number) {
				NumberFormat numberFormat = new DecimalFormat(formats.get(0));
				return numberFormat.format(obj);
			}
			return (String)((AbstractNumberConverter) converter).convert(obj, locale,  timezone, formats.get(0));
		}
		if(converter instanceof DateToString) {
			return ((DateToString) converter).convert((Date)obj, locale, timezone, formats.get(0));
		}
		
		return (String)converter.convert(obj);
	}
	
	
	@SuppressWarnings("unchecked")
	public static <T> T convertFromString(Class<T> targetType, Field field, String val) throws ConversionException, ClassNotFoundException {
		if (val == null) {
			return null;
		}

		List<String> formats = new ArrayList<String>();
		Locale locale = null;
		TimeZone timezone = null;
		
		if(field.isAnnotationPresent(EDIElementFormats.class)) {
			EDIElementFormats formatsAnnotation = field.getAnnotation(EDIElementFormats.class);
			EDIElementFormat[] elementFormats = formatsAnnotation.value();
			for (int i = 0; i < elementFormats.length; i++) {
				if (elementFormats[i].value() != null) {
					formats.add(elementFormats[i].value());
				}
			}
		}
		
		if(field.isAnnotationPresent(EDIElementFormat.class)) {
			EDIElementFormat formatAnnotation = field.getAnnotation(EDIElementFormat.class);
			formats.add(formatAnnotation.value());
		}
		
		if(field.isAnnotationPresent(EDILocale.class)) {
			EDILocale localeAnnotation = field.getAnnotation(EDILocale.class);
			locale = new Locale(localeAnnotation.language(), localeAnnotation.region());
		}
		else {	
			locale = Locale.getDefault();
		}
		 
		if(field.isAnnotationPresent(EDITimezone.class)) {
			EDITimezone timezoneAnnotation = field.getAnnotation(EDITimezone.class);
			timezone = TimeZone.getTimeZone(timezoneAnnotation.timezone());
		}
		else {
			timezone = TimeZone.getDefault();
		}
		
		Converter converter = Converters.getConverter(String.class, targetType);
		
		for (int i = 0; i < formats.size(); i++) {
			try {
				if(converter instanceof AbstractNumberConverter) {
					if(Number.class.isAssignableFrom(field.getType())) {
							NumberFormat numberFormat = new DecimalFormat(formats.get(i));
							Number number;
							try {
								number = numberFormat.parse(val);
								
								LOG.debug("Number type: "+ReflectionToStringBuilder.toString(number));
								
							} catch (ParseException e) {
								throw new ConversionException("Exception converting ["+val+"] with format: "+formats.get(i));
							}
							Converter numberConverter = Converters.getConverter(number.getClass(), targetType);
							return (T)numberConverter.convert(number);
					}
					return (T)((AbstractNumberConverter) converter).convert(val, locale,  timezone, formats.get(i));
				}
				if(converter instanceof StringToDate) {
					return (T)((StringToDate) converter).convert(val, locale, timezone, formats.get(i));
				}
			} catch (ConversionException e) {
				// Only rethrow the ConversionException if all formats have been attempted
				if (i < formats.size()-1) {
					continue;
				}
				
				throw e;
			}
		}
		return (T)converter.convert(val);
	}
}

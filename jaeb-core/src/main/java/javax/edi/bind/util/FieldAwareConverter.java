package javax.edi.bind.util;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.edi.bind.annotations.elements.EDIElementFormat;
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

		String format = null;
		Locale locale = null;
		TimeZone timezone = null;
		
		if(field.isAnnotationPresent(EDIElementFormat.class)) {
			EDIElementFormat formatAnnotation = field.getAnnotation(EDIElementFormat.class);
			format = formatAnnotation.format();
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
				NumberFormat numberFormat = new DecimalFormat(format);
				return numberFormat.format(obj);
			}
			return (String)((AbstractNumberConverter) converter).convert(obj, locale,  timezone, format);
		}
		if(converter instanceof DateToString) {
			return ((DateToString) converter).convert((Date)obj, locale, timezone, format);
		}
		
		return (String)converter.convert(obj);
	}
	
	
	public static <T> T convertFromString(Class<T> targetType, Field field, String val) throws ConversionException, ClassNotFoundException {
		if (val == null) {
			return null;
		}

		String format = null;
		Locale locale = null;
		TimeZone timezone = null;
		
		if(field.isAnnotationPresent(EDIElementFormat.class)) {
			EDIElementFormat formatAnnotation = field.getAnnotation(EDIElementFormat.class);
			format = formatAnnotation.format();
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
		
		if(converter instanceof AbstractNumberConverter) {
			if(Number.class.isAssignableFrom(field.getType())) {
				NumberFormat numberFormat = new DecimalFormat(format);
				Number number;
				try {
					number = numberFormat.parse(val);
					
					LOG.debug("Number type: "+ReflectionToStringBuilder.toString(number));
					
				} catch (ParseException e) {
					throw new ConversionException("Exception converting ["+val+"] with format: "+format);
				}
				Converter numberConverter = Converters.getConverter(number.getClass(), targetType);
				return (T)numberConverter.convert(number);
			}
			return (T)((AbstractNumberConverter) converter).convert(val, locale,  timezone, format);
		}
		if(converter instanceof StringToDate) {
			return (T)((StringToDate) converter).convert(val, locale, timezone, format);
		}
		
		return (T)converter.convert(val);
	}
}

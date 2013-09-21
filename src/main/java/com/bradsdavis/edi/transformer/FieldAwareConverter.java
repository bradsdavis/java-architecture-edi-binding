package com.bradsdavis.edi.transformer;

import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.convert.ConversionException;
import org.apache.commons.convert.Converter;
import org.apache.commons.convert.Converters;
import org.apache.commons.convert.DateTimeConverters.DateToString;
import org.apache.commons.convert.NumberConverters.AbstractNumberConverter;

import com.bradsdavis.edi.annotations.elements.EDIElementFormat;
import com.bradsdavis.edi.annotations.elements.EDILocale;
import com.bradsdavis.edi.annotations.elements.EDITimezone;

public class FieldAwareConverter {

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
}

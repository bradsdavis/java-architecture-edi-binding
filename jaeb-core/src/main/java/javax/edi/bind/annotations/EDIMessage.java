package javax.edi.bind.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EDIMessage {
	String elementDelimiter() default "*";
	String componentDelimiter() default ":";
	String segmentDelimiter() default "\n";
}

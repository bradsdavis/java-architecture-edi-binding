package javax.edi.bind.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EDIMessage {
	char elementDelimiter() default '*';
	char componentDelimiter() default '>';
	char segmentDelimiter() default '~';
}

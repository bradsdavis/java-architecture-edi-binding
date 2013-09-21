package javax.edi.bind.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EDISegment {
	String tag();
	String delimiter() default "\n";
	int minOccurs() default 1;
	int maxOccurs() default 1;
	
}

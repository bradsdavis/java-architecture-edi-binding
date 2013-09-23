package javax.edi.bind.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EDIElement {
	boolean required() default false;	
	boolean conditional() default false;
	
	String dataElement() default "";
	String description() default "";
	String fieldName() default "";
}

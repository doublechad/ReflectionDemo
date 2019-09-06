package tw.demo.chapter3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
//@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
    String value() default "我是預設值";
}

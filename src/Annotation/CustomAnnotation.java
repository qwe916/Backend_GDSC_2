package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation 생성
 */
@Target(ElementType.METHOD)//메소드
@Retention(RetentionPolicy.RUNTIME)//컴파일 이후에도 JVM에 의해 계속 참조 가능
public @interface CustomAnnotation {//CustomAnnotation
    int myAge() default 24;
}

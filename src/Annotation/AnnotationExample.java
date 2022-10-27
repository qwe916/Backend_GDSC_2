package Annotation;

import java.lang.reflect.Method;

/**
 * Annotation
 */
public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m1 = AnnotationExample.class.getDeclaredMethod("printAgeDefault");
        CustomAnnotation defaultAnnotation = m1.getAnnotation( CustomAnnotation.class);
        System.out.println(defaultAnnotation.myAge());//defaultAnnotation.myAge 출력
        Method m2 = AnnotationExample.class.getDeclaredMethod("printAgeCustom");
        CustomAnnotation customAnnotation = m2.getAnnotation( CustomAnnotation.class);
        System.out.println(customAnnotation.myAge());//customAnnotation.myAge 출력
    }
    @CustomAnnotation//printAgeDefault 메소드에 @CustomAnnotation 적용
    public static void printAgeDefault() {
    }
    @CustomAnnotation(myAge =  28)//printAgeCustom 메소드에 @CustomAnnotation 적용(myAge 28로 초기화)
    public static void printAgeCustom() {
    }
    }


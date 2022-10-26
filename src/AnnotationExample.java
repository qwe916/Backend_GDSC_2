import java.lang.reflect.Method;

/**
 * Annotation
 */
public class AnnotationExample {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m1 = AnnotationExample.class.getDeclaredMethod("printAgeDefault");
        CustomAnnoation defaultAnnotation = m1.getAnnotation(CustomAnnoation.class);
        System.out.println(defaultAnnotation.myAge());
        Method m2 = AnnotationExample.class.getDeclaredMethod("printAgeCustom");
        CustomAnnoation customAnnotation = m2.getAnnotation(CustomAnnoation.class);
        System.out.println(customAnnotation.myAge());
    }
    @CustomAnnoation
    public static void printAgeDefault() {
    }
    @CustomAnnoation(myAge =  28)
    public static void printAgeCustom() {
    }
    }


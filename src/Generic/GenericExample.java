package Generic;

public class GenericExample {
    public static void main(String[] args) {
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>();//Integer 타입 MyGenericClass
        MyGenericClass<String> exampleString = new MyGenericClass<>();//String 타입 MyGenericClass

        exampleInteger.setValue(1);//1로 value 초기화
        exampleString.setValue("Hello, generics!");//"Hello, generics"으로 value 초기화
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());

    }
}

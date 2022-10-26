public class GenericExample {
    public static void main(String[] args) {
        MyGenericClass<Integer> exampleInteger = new MyGenericClass<>();
        MyGenericClass<String> exampleString = new MyGenericClass<>();

        exampleInteger.setValue(1);
        exampleString.setValue("Hello, generics!");
        System.out.println(exampleInteger.getValue());
        System.out.println(exampleString.getValue());

    }
}

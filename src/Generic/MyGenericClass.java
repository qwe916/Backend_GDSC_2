package Generic;

/**
 * 제네릭
 * 파라미터가 어느 자료형이든 입력 받을 수 있고 불필요한 형변환이 일어나지 않는다.
 * @param <T>
 */

/**
 * extends 키워드를 통해 Bound 할 떄는 지정한 클래스의 부모 클래스로 객체를 생성한 후 사용하면 오류가 발생한다.
 * super 키워드를 통해 Bound할 떄는 자식 클래스로 객체를 생성하고 사용할때 오류가 발생한다.
 * @param <T extends Number> <T super Number>
 */
public class MyGenericClass<T> {
    private T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

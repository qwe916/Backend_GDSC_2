/**
 * 제네릭
 * 파라미터가 어느 자료형이든 입력 받을 수 있고 불필요한 형변환이 일어나지 않는다.
 * @param <T>
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

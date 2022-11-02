package Oprional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String nullableStr = null;
        String neverNullStr = "null이면 안됩니다.";

        //null이 아닌 값이 넘어오면 해당 값을 가진 Optional 인스턴스 변환
        Optional<String> optNotNull = Optional.of(neverNullStr);

        //null이 넘어오면 빈 Optional 변환(null이 아닌 값이 넘어오면 of와 같은 동작)
        Optional<String> optNullable = Optional.ofNullable(nullableStr);

        System.out.println("optNullable = " + optNullable);
        System.out.println("neverNullStr = " + neverNullStr);
    }

}

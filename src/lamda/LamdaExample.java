package lamda;

import java.util.Scanner;

public class LamdaExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //메소드 오버라이딩을 간편하게 해준다.
        PrintResult pr = (a, b) -> a > b ? a : b;
        System.out.println(pr.printResult(num1,num2));
    }
}

//함수형 인터페이스
@FunctionalInterface
interface PrintResult {
    /**
     * 메소드는 1개만 가능
     */
    int printResult(int a, int b);
}

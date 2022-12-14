package Exception;

import java.util.Scanner;

/**
 * Exception
 */
public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;
        /**
         * try ~catch finally 문
         */
        try {
            result = a / b;
            System.out.println(result);
        } catch (Exception e) {//예외 발생시
            System.out.println("0으로는 나눌 수 없다.");
        } finally {//예외 처리와 상관 없이 실행되는 finally
            System.out.println("재밌는 java study");
        }
    }
}

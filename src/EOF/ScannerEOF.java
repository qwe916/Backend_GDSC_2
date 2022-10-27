package EOF;

import java.util.Scanner;

/**
 * Scanner
 */
public class ScannerEOF {
    public static void main(String[] args) {
        /**
         * Scanner 객체 생성
         */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {//입력한 값 출력
            System.out.println(scan.nextLine());
        }
        System.out.println("Scanner EOF");
    }
}

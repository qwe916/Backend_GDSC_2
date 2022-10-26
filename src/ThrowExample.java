import java.util.Scanner;

/**
 * throws 문
 */
public class ThrowExample {
    /**
     * 예외처리 로직
     * @param choice
     * @throws NotFunnyException
     */
    public void checkChoice(int choice) throws NotFunnyException {
        if (choice == 1) {
            throw new NotFunnyException();
        } else {
            System.out.println("집에 가고 싶습니다.");
        }

    }
    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Java 서터디는 재밌습니까? (1 Yes / 2 No) : ");
        int choice = sc.nextInt();
        try {
            //예외 처리
            throwExample.checkChoice(choice);
        } catch (NotFunnyException e) {
            System.out.println("다시 선택하시오");
        }
    }
}

/**
 * 예외 생성
 */
class NotFunnyException extends RuntimeException {
    NotFunnyException() {
        super("공부는 재미없다.");
    }
}

import java.util.ArrayList;

/**
 * 스레드
 */
public class ThreadExample extends Thread {
    //순서 변수
    private int order;
    //생성자
    public ThreadExample(int order) {
        this.order = order;
    }
    //Thread run 함수
    @Override
    public void run() {
        System.out.println(this.order + "번째 스레드 시작합니다.");
        try {
            Thread.sleep(1000);//쓰레드 1000ms 멈추기
        } catch (Exception e) {
            System.out.println(this.order + "번쨰 스레드 시작합니다.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Thread> threadList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            Thread thread = new ThreadExample(i);//쓰레드 생성
            thread.start();//쓰레드 실행
            threadList.add(thread);
        }
        for (int i = 0; i < threadList.size(); i++) {
            Thread thread = threadList.get(i);
            try {
                thread.join();//자신을 호출한 스레드가 종료될때까지 대기하는 함수
            } catch (Exception e) {
            }
        }
        System.out.println("main 메소드 종료합니다.");
    }
}

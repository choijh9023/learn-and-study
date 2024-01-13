package thread.threadclass;
//24년 1월 12일 쓰레드 개념
// 이 코드를 실행하면 각 스레드의 진행 속도가 다르다
//이유는 각자의 상태가
import java.awt.*;

public class BeepPrintThread {
    public static void main(String[] args) { // 메인스레드 안에 작업스레드를 포문을 3번을 돌려서 3개를 생성하고 있다(즉, 메인을 포함해서 총 4개의 스레드가 있다.)
        for (int i = 0; i < 3; i++) { // 메인 스레드 전체를 포문으로 돌렸다.
        Thread thread = new Thread() {
            @Override
            public void run() {
                    setName("subThread");
                System.out.println(getName() + " 실핼중 ");
            }
        };

        thread.start();
        Thread mainThread = Thread.currentThread();
        mainThread.setName("메인 쓰래드");
        System.out.println(mainThread.getName() + " 실핼중 ");
        };
    }
}

package thread.threadex;

/**24년 1월 12일 쓰레드 오후 수업
 * 코드실습
 */
public class ThreadDemonEx {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("currentThread = "+ t1); // 현재 실행중인 스레드의 참조값을 반환하는 출력

        // ThreadEx11 스래드 t2만들어서 t2의 반환값 확인 (Runnable사용해서만들기)
        Thread t2 = new Thread(new ThreadEx11());
        System.out.println("t2" +t2);
    }
}


//
class ThreadEx11 implements Runnable {
    @Override
    public void run() {

    }
}


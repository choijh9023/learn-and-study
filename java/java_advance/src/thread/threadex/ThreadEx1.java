package thread.threadex;
//24년 1월 12일 쓰래드 수업
public class ThreadEx1 {
    public static void main(String[] args) {
        // 쓰래드를 생성하는 2가지 방법
        //1. 상속으로 Thread 생성
        ThreadByInheritance t1 = new ThreadByInheritance(); // 객체 생성
        //2. Runnable Interface 로 Thread생성
        Runnable runnable = new ThreadByImplement(); // 객체 생성

        //(일반적으로 2번형태를 더 많이 사용한다)
        Thread t2 = new Thread(runnable); // target 생성 (2. 객체 생성 방법)
        /**
         Thread t3 = new Thread(new ThreadByImplement()); 이건 좀 해깔림
         t3.start();
         */
        t1.start();
        t2.start();
        /**
         * 이렇게 하면 메인쓰레드를 통해서 쓰레드 2개를 실행시키는 것을 의미한다.
         * t1.start는 자기만의 스택영역을 생성하고 런이라는 매소드를 호출한다.
         * t2.start도 마찬가지로 자기만의 스택영역을 생성하고 런이라는 매소드를 호출한다.
         * 그리고 각 쓰래드가 끝나면 각각의스택영역은 팝되고 사라진다.
         * @@@@ 한번 사용하고 난 쓰레드는 다시 재사용이 안된다.@@@@@
         * 그리고 스캐쥴러드이 스택영역들을 실행시킨다.IllegalThreadStateException(잘못된 스레드 상태 예외)에러가 뜬다.
         *
         * 그리고
         */

        t1.start();
        t2.start();
    }
}
class ThreadByInheritance extends Thread { //쓰래드를 상속 받아서 많든 클래스다
                                            //이러면 런이라는 메소드를 오버라이딩해야한다.

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(0);
        }
    }
}

class ThreadByImplement implements Runnable { //얘도 마찬가지로 런이라는 메소드를 꼭 오버라이딩해줘야한다.
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(1);
        }
    }
}
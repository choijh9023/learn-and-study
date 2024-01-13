package thread.threadex.join;
//Single Thread
import javax.swing.*;
//interrupt 메소드 : 쓰레드를 안전하게 종료시킬 때 사용한다. 스레드를 실행 도중 종료 시키고 싶을때 사용
//get.Name은 스태틱이다.
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadEx1());
        Thread t2 = new Thread(new ThreadEx1());
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
      //  t1.interrupt();// 이건 상태를 인터럽트상태로 바꾸는것


       // t1.run();
      //  System.out.println(t1.isAlive()); // 상태체크
      //  System.out.println("isInterrupted : "+ t1.isInterrupted());
       // System.out.println("isInterrupted : "+ t2.isInterrupted());


        }
    }
 class ThreadEx1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()); //current 메소드 뜻 알아야한다

        for (int i = 0; i < 20; i++) {
            if (Thread.currentThread().getName().equals("Thread1")){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {

                }
            }
            System.out.print("*");
        }

        System.out.println();

        System.out.printf("[%s, 종료]%n", Thread.currentThread().getName());
    }
 }
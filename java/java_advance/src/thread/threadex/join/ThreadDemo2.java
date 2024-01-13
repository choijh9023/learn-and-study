package thread.threadex.join;
//Single Thread
import javax.swing.*;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CountDownThread());
        t1.start();
        //사용자 입력
        String name = JOptionPane.showInputDialog("이름을 입력하세요!");
        System.out.println("이름은 " + name + "입니다.");


        }
    }

    class CountDownThread implements Runnable {

        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e) {
                }
            }
        }
    }
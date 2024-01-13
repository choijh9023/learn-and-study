package Loop2;

import java.util.Scanner;

public class Loop9046_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if ((number > 10) || (number < 0)) {
                continue;


            } else {
                for (int count = 0; count < number; count++) {

                    System.out.println("C언어 프로그래밍");
                }       break;
            }
        }
    }
}

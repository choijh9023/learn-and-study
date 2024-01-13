package Loop1;

import java.util.Scanner;

public class Loop9043_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int avg = 0;
        int count = 0;

        while (true) {
            int number = sc.nextInt();

            if (number % 2 == 1) {

                total += number;
                count++;


            }
            if (number == 0) {
                avg = total / count;
                System.out.println("홀수의 합 = " + total);
                System.out.println("홀수의 평균 = " + avg);
                break;
            }


        }
    }
}

package Jungol.Loop1;

import java.util.Scanner;

public class Loop9042_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;
        double avg = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            total += number;
            count++;
            avg = (total / (double)count);


        }
        System.out.println("입력된 자료의 개수 = " + count);
        System.out.println("입력된 자료의 합계 = " + total);
        System.out.printf("입력된 자료의 평균 = %.2f \n", avg);
    }
}


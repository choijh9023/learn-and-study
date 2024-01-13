package Jungol.Loop3;

import java.util.Scanner;

public class Loop140_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //카운트 변수 선언 초기화 (평균을 연산하기위해)
        int sum = 0; // 총합 변수 선언 초기화
        int avg = 0; //


        for (int i = 0; i < 20; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        avg = sum / count;
        System.out.printf("%d %d", sum, avg);


    }
}
package Jungol.Loop2;

import java.util.Scanner;

public class Loop135_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); //2개의정수를 받기위해
        int num2 = sc.nextInt(); //2개의정수를 받기위해
        double avg = 0;
        double total = 0;
        int count = 0;

        if (num1 > num2) {   // 만약 num1이 num2 보다 크다면?
            int temp = num2; //temp 사용해서 다른경우를 차단
            num2 = num1;    //temp 를 사용할떈 변수 선언 다시하면 안된다.
            num1 = temp;
        }
        for (int i = num1; i <= num2; i++) { //num1이 num2 보다 작다는 조건으로
            //반복문 작성
            if (i % 3 == 0) { //3의 배수 총합 연산 시작
                count++;
                total += i;
            }else if (i % 5 == 0) {       //5의 배수 총합 연산 시작
                count++;
                total += i;
            }
            avg=total/count;

    }System.out.printf("sum : %d\n",(int)total);
        System.out.printf("avg : %.1f\n",avg);
    }

    }





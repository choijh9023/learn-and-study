package Jungol.Loop2;

import java.util.Scanner;

public class Loop131_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt(); //2개의정수를 받기위해
        int num2 = sc.nextInt(); //2개의정수를 받기위해
        //정확하게 짜기 위해선 while(true)를 넣고
        // 두개의 정수가 같은경우는 if(num1==num2){continue;}를해서
        //생길 경우의 수를 차단해줘야할수도 있다.
        //일단 다른 숫자를 받는다는 전제조건으로 문제가 출제된 경우같다. 정답처리가 되었다.
        if (num1 <= num2) {  // 경우의 수를 나누기 위해 이프 포문 2개 작성
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");

            }
        }
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.print(i + " ");

            }


        }

    }
}
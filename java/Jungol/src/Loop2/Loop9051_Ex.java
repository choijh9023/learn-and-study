package Loop2;

import java.util.Scanner;

public class Loop9051_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //짝수일 경우의 숫자 갯수를 담을 변수를 선언한다.

        for (int a = 0; a < 10; a++) {     // 10개의 정수를 받는다.
            int num = sc.nextInt();


            if ((num % 2 == 0)) { //짝수인 경우를 제어하기위해 if문
                count += 1; // count = count +1 // 짝수가 생겼네? 갯수하나 올려
            }


        }
        System.out.printf("입력받은 짝수는 %d개입니다.", count);
    }
}


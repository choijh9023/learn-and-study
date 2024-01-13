package Loop2;

import java.util.Scanner;

public class Loop545_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 포문으로도 풀수는 있을 것 같다.
        int three = 0; //3의 배수를 체크하기위한 변수
        int five = 0;   //5의 배수를 체크하기 위한 변수
        int count = 0;  //입력값을 10번으로 제어하기위한 변수

        while (true) { //반복 시작
            int num = sc.nextInt();
            count++;

            if (num % 3 == 0) { //3의 배수가 나온 경우 체크
                three++;
            }
            if (num % 5 == 0) {     //5의 배수가 나온 경우 체크
                five++;
            }
            if (count == 10) {  //10번이 나온 경우 제어
                break;
            }
        }
        System.out.println("Multiples of 3 : " + three);
        System.out.println("Multiples of 5 : " + five);
    }
}

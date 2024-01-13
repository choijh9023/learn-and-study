package Loop2;

import java.util.Scanner;

public class Loop133_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 정수를 받는 횟수를 위한 입력기
        double avg = 0;     // 평균값 출력을 위한 변수
        double total = 0;   // 평균값 연산을 위한 변수
        int count = 0;  //평균값 연산을 위한 변수

        for (int i = 0; i < num; i++) { //받은 정수 만큼 정수를 입력 받기위한 반복문 실행
            count++;
            int num1 = sc.nextInt();
            total += num1; //받은 변수만큼 total 변수에 더해주기 위한 복합대입연산자 적용

        }

        avg = total / count;    //평균연산 실행
        System.out.printf("%.2f", avg); //출력 실행
    }
}

package Loop2;

import java.util.Scanner; // 평균 총점을 구하는 문제

public class Loop546_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 10 이하의 과목수를 받기위한 입력기
        double avg = 0; //평균 값을 위한 변수
        double total = 0; // 평균 값을 연산하기 위한 변수
        int count = 0; // 평균 값을 연산하기 위한 변수
        int num = sc.nextInt(); //입력기 생성

        for (int i = 0; i < num; i++) { //10이하 의 과목수 n을 받기 위한 반복
            count++;
            int num1 = sc.nextInt();
            total += num1; // total = total + num1

        }
        avg = (double) total / count;
        if (avg >= 80) {
            System.out.printf("avg : %.1f\n", avg);
            System.out.printf("pass");
        }
            else {
                System.out.printf("avg : %.1f\n", avg);
                System.out.printf("fail");


            }


        }

    }




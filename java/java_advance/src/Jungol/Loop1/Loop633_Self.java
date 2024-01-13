package Jungol.Loop1;

import java.util.Scanner;

public class Loop633_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기


        while (true) {      //무한반복을 위해 while(true)문 작성
            System.out.print("1. Korea\n" +  //출력문 먼저 작성
                    "2. USA\n" +
                    "3. Japan\n" +
                    "4. China\n" +
                    "number?" + " ");
            int num = sc.nextInt(); // 출력 후 입력기 생성
            if ((num < 1) || (num > 4)) { // 1~4 이외의 숫자가 나왔을 경우 none출력 후 break
                System.out.println();
                System.out.println("none");
                break;
            }

            if (num == 1) {  //1번 경우
                System.out.println();
                System.out.println("Seoul\n");
            }
            if (num == 2) { //2번경우
                System.out.println();
                System.out.println("Washington\n");
            }
            if (num == 3) { //3번경우
                System.out.println();
                System.out.println("Tokyo\n");
            }
            if (num == 4) {  //4번경우
                System.out.println();
                System.out.println("Beijing\n");
            }
        }
    }
}
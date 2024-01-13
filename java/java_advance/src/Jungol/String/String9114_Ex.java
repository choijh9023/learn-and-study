package Jungol.String;

import java.util.Scanner;

public class String9114_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            String str = sc.next();
            a = str.charAt(0);
            if ((64 < a) && (a < 91)) {
                System.out.println("대문자입니다.");
            } else if ((96 < a) && (a < 123)) {
                System.out.println("소문자입니다.");
            } else if ((47 < a) && (58 > a)) {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
            }


        }
    }
}
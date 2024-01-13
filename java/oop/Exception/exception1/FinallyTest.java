package oop.Exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyTest {
    //예외처리 테스트 2개의 정수를 받아서  처음 받은 정수를 두번쨰 받은 정수로 나눈 값을 출력할 때 예외 처리
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //내가 작성한 코드

        System.out.println("프로그램 시작");
        int first = sc.nextInt();
        int two = sc.nextInt();

        returnintFinally(first, two);
        System.out.println("프로그램 종료");
    }

    static void returnintFinally(int number1, int number2) {
        try {
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }


}

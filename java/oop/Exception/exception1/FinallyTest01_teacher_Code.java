package oop.Exception.exception1;

import java.util.Scanner;

public class FinallyTest01_teacher_Code {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n======= 프로그램 시작 =======\n");

        try {
            FinallyTest test = new FinallyTest();

         //   int checkNum = FinallyTest.returnIntFinally(sc.nextInt(), sc.nextInt());
          //  System.out.println(checkNum);
        } catch (Exception e) {
            System.out.println("main 메소드의 catch");
        }


        System.out.println("\n======= 프로그램 종료 =======\n");

    }

    public static int returnIntFinally(int num1, int num2) throws ArithmeticException {
        System.out.println("두 수를 입력하세요.");

        try {
            double result = (double) (num1 / num2);
            System.out.printf("num1 / num2 = %.1f%n", result);

            return 0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("0으로 나눌 수 없습니다.");

            return 1;
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("예외가 발생했습니다.");
        } /*finally {
            System.out.println("finally 출력!");

            return 1;
        }*/
        return 3;

    }
}
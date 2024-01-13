package Jungol.String;

import java.util.Scanner;

public class String9117_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //next는 스페이스와 엔터키로 줄을 구분해준다.
        int num = str.length();
        int num1 = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length()- i; j++) {
                System.out.print(str.charAt(j+i));

            }
            for (int k = 0; k <=i ; k++) {
                System.out.print(str.charAt(k));
            }


            System.out.println();
        }


            }




    }




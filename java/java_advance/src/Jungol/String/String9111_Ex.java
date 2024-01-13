package Jungol.String;

import java.util.Scanner;

public class String9111_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "jungol olympiad";
        int[] intArray = new int[5];

        for (int i = 0; i <= 4; i++) {
            intArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(str.charAt(intArray[i])); //문자열안에 특정위치에 있는 문자를 뺴오는 함수 .charAt
        }

    }


}


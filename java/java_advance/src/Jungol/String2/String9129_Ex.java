package Jungol.String2;

import java.util.Scanner;

public class String9129_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] doubleArray = new double[3];
        for (int i = 0; i < 3; i++) {
            doubleArray[i] = sc.nextDouble();

        }
        double num1 = (Math.round(doubleArray[0] * 100) / 100.0);
        //double num2 = (Math.round(doubleArray[1] * 100) / 100.0); // 0이 출력이 안된다......
        double num3 = (Math.round(doubleArray[2] * 100) / 100.0);
        String num2 = String.format("%.2f",(Math.round(doubleArray[1] * 100) / 100.0));
        String[] strArrays = new String[3];
        strArrays[0] = String.valueOf(num1);
        strArrays[1] = String.valueOf(num2);
        strArrays[2] = String.valueOf(num3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        char a = '.';
        for (int i = 0; i < strArrays[0].length(); i++) {
            if (a == strArrays[0].charAt(i)) {
                System.out.println();
                i++;
            }
            System.out.printf("%c", strArrays[0].charAt(i));
        }
        for (int i = 0; i < strArrays[1].length(); i++) {
            if (a == strArrays[1].charAt(i)) {
                System.out.println();
                i++;
            }
            System.out.printf("%c", strArrays[1].charAt(i));
        }
            for (int i = 0; i < strArrays[2].length(); i++) {
                if (a == strArrays[2].charAt(i)) {
                    System.out.println();
                    i++;
                }
                System.out.printf("%c", strArrays[2].charAt(i));


            }

    }
}
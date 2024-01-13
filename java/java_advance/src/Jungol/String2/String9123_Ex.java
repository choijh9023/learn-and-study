package Jungol.String2;

import java.util.Scanner;

public class String9123_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = new String[2];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();
        }
        System.out.print(strArray[1]+strArray[0]);

    }
}

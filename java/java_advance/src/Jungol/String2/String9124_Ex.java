package Jungol.String2;

import java.util.Scanner;

public class String9124_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []strArray = new String[2];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();
        }
        System.out.println(strArray[1].substring(0,3)+strArray[0].substring(3));
        System.out.println(strArray[1]+strArray[0].substring(0,3));

    }
}

package Jungol.String;

import java.util.Scanner;

public class String9116_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a = ' '; //char 공백가능
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (str.charAt(i)==a) {
                System.out.println();
            }


        }
    }
}

package Jungol.String;

import java.util.Scanner;

public class String9108_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String num = sc.nextLine();
            System.out.printf("%1s",num);
            int i = num.charAt(0);
            System.out.printf(" -> %d\n",i);
            if (i == 48) {
                break;
            }


        }
    }
}
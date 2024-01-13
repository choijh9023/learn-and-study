package Jungol.Loop3;

import java.util.Scanner;

public class Loop142_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num * 0 + i; j++) {
                System.out.printf("*");
            }
            System.out.println();

        }

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.printf("*");
            }
            System.out.println();

        }


    }
}

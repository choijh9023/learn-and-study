package Jungol.Loop3;


import java.util.Scanner;

public class Loop146_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char A = 'A';
        int num1 = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {

                System.out.print(A);
                A++;
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(num1);
                System.out.print(" ");
                num1++;
            }
            System.out.println();


        }


    }
}


package Loop2;

import java.util.Scanner;

public class Loop139_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        if (num1 >= num2) {
            for (int i = 1; i <= 9; i++) {
                for (int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   "   , j, i, j * i);
                }
                System.out.println();
            }


        }
        if (num1 < num2) {
            for (int i = 1; i <= 9; i++) {
                for (int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }


        }
    }
}

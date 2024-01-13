package Loop3;

import java.util.Scanner;

public class Loop145_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            for (int j = i; j < num * 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k+1);
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}

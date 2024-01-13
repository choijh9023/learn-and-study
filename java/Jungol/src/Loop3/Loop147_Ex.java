package Loop3;


import java.util.Scanner;

public class Loop147_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int num1 = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(" ");
                System.out.print(" ");

            }
            for (int j = 0; j < num - i; j++) {

                System.out.print(num1);
                num1++;
                System.out.print(" ");
            }

            System.out.println();


        }


    }
}


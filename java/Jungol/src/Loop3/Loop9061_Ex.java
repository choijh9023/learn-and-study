package Loop3;

import java.util.Scanner;

public class Loop9061_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =1;
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j < num; j++) {
                System.out.print(count++ + " ");
            } System.out.println();
        }


    }
}
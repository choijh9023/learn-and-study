package Jungol.Loop3;

import java.util.Scanner;

public class Loop144_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        int num1 = 0;
        for (int i = 1; i <=num ; i++){

                for(int j=i;j<num*2-i;j++){
                    System.out.print(" ");
                }
                for(int k =0 ; k<i+num1;k++){
                    System.out.print("*");
                } System.out.println();num1++;

        }
    }
}

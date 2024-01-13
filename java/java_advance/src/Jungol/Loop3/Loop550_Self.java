package Jungol.Loop3;

import java.util.Scanner;

public class Loop550_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for( int i = 0; i<num ; i++){
            for(int k = 0 ; k<num-i;k++){
                System.out.printf("*");

            }
            System.out.println();
        }



        for( int i = 0; i<num ; i++){
            for(int k = 0 ; k<=i;k++){
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}

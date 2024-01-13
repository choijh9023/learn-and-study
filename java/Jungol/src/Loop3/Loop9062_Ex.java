package Loop3;

import java.util.Scanner;

public class Loop9062_Ex {
    public static void main(String[] args) {
        int count = 1;
        char i = 'a';
        for (int a = 0; a <4; a++) {
            for (int j = 0 ; j <1+a; j++) {
                System.out.print(i++ +" ");
            }
            for(int j = 0 ;j<4-a;j++){
                System.out.print(count++ + " ");
            }System.out.println();

        }




    }
}
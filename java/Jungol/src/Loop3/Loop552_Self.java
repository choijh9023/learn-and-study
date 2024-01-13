package Loop3;

import java.util.Scanner;

public class Loop552_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int a= 0;a<num;a++){
            for(int k = 0 ;k < a;k++){
                System.out.printf("-");
            }
            for(int i = 0;i < 2*(num-a)-1;i++){
                System.out.printf("*");
            }
            System.out.println();


        }
    }
}

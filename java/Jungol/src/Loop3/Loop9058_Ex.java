package Loop3;

import java.util.Scanner;

public class Loop9058_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            for(int j =num;j>i+1;j--){
                System.out.printf(" ");
            }
            for(int k = 0 ; k<=i;k++){
                System.out.printf("*");
            }
            System.out.println();

        }

    }
}

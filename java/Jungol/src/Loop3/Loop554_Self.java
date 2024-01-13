package Loop3;

import java.util.Scanner;

public class Loop554_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        char b = 'A';
        for(int i =0; i<num ; i++){
            for(int j= 0;j<num-i;j++){
                System.out.print(a++ + " ");
            }
            for(int c=0;c<i+1;c++){
                System.out.print(b++ + " ");
            }
            System.out.println();
        }
    }
}

package Loop1;

import java.util.Scanner;

public class Loop129_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;


        while(true){
            int b = sc.nextInt();
            int c = sc.nextInt();
            a = (double)(b*c)/2;
            System.out.printf("Base = ");
            System.out.printf("Height = ");
            System.out.printf("Triangle width = %.1f\n",a);
            System.out.printf("Continue?"+ " ");
            char d = sc.next().charAt(0);
            if(!(d==89)&&!(d==121)) {
                break;
            }



        }


    }
}

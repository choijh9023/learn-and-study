package String2;

import java.util.Scanner;

public class String9120_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char i = ' ';

        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j));
            if(i == str.charAt(j)){
                System.out.println();
            }


        }

    }
}

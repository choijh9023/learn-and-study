package String2;

import java.util.Scanner;

public class String9118_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = new String[5];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();

        }
        for (String s : strArray) {
            System.out.printf("%s\n",s);

        }

    }


}
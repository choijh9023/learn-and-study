package String;

import java.util.Scanner;

public class String9115_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] intArray = new int[100];
        int num = 0;
        int a = 0;
        for (int i = 0; i < str.length(); i++) {          //StringBuilder클래스 //tocharArray  사용할 수 있다.
            intArray[i] = str.charAt(a);
            a++;
            if ((intArray[i] < 91) && (intArray[i] > 64)) {

                num = intArray[i] + 32;
                System.out.print((char)num);
                num = 0;
            } else if ((intArray[i] > 96) && (intArray[i] < 123)) {
                num = intArray[i] - 32;
                System.out.print((char)num);
                num = 0;
            }


        }
        System.out.print(".");

    }
}

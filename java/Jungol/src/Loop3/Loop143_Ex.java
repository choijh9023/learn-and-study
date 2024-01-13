package Loop3;

import java.util.Scanner;  // 숫자의 연산 규칙이  일정하지만 숫자조합이 변수가 몇개가 더 필요하여 변수를 추가로 만들었다.
                            // 규칙적인 연산 ->  1  -> 3이 나오면 5 , 4가 나오면-> 7  , 5가 나오면 -> 9
public class Loop143_Ex {               //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < (num * 0) + i; j++) {
                System.out.printf(" ");

            }
            for (int k = i + count; k <= (num * 2) - 1; k++) {
                System.out.printf("*");

            }
            System.out.println();
            count++;

        }
        int b = 0;
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                System.out.printf(" ");
            }
            for (int a = 0; a < 3 + (2 * b); a++) {
                System.out.printf("*");
            }
            b++;
            System.out.println();

        }


    }
}

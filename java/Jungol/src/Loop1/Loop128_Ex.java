package Loop1;

import java.util.Scanner;

public class Loop128_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; // 개수 출력을 위한 변수

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;

            }
            count++;
            if ((num % 3 == 0) || (num % 5 == 0)) {
                count--;
            }
        }
        System.out.println(count);
    }
}

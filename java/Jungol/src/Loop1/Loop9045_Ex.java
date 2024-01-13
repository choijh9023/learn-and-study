package Loop1;

import java.util.Scanner;

public class Loop9045_Ex { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. 입력하기\n" +
                    "2. 출력하기\n" +
                    "3. 삭제하기\n" +
                    "4. 끝내기\n" +
                    "작업할 번호를 선택하세요. ");
            int number = sc.nextInt();

            if ((4 < number) || (1 > number)) {
                System.out.println("\n잘못 입력하였습니다.");
            }
            if (number == 1) {
                System.out.println("\n입력하기를 선택하였습니다.\n");
            }
            if (number == 2) {
                System.out.println("\n출력하기를 선택하였습니다.\n");
            }
            if (number == 3) {
                System.out.println("\n삭제하기를 선택하였습니다.\n");
            }
            if (number == 4) {
                System.out.println("\n끝내기를 선택하였습니다.\n");
                break;
            }

        }

    }
}

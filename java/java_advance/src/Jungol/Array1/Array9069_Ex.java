package Jungol.Array1;

import java.util.Scanner;

public class    Array9069_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] day = {28, 29, 30, 31};

        while (true) {
            int YEAR = sc.nextInt();
            int MONTH = sc.nextInt();
            if (MONTH == 0) {
                System.out.printf("YEAR = ");
                System.out.printf("MONTH = ");
                break;
            }
            if ((MONTH == 1) || (MONTH == 3) || (MONTH == 5) || (MONTH == 7) || (MONTH == 8) || (MONTH == 10) || (MONTH == 12)) {
                System.out.print("YEAR = ");
                System.out.print("MONTH = ");
                System.out.printf("입력하신 달의 날 수는 %d일입니다.", day[4]);
            }
            if (MONTH > 12) {
                System.out.print("YEAR = ");
                System.out.print("MONTH = ");
                System.out.println("잘못 입력하였습니다.");
            }
            System.out.println();
            if (MONTH == 2) {

                if (YEAR % 400 == 0) {

                    if ((YEAR % 4 == 0) || (YEAR % 100 != 0)) {
                        System.out.print("YEAR = ");
                        System.out.print("MONTH = ");
                        System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", day[1]);
                    } else {
                        System.out.print("YEAR = ");
                        System.out.print("MONTH = ");
                        System.out.printf("입력하신 달의 날 수는 %d일입니다.", day[0]);

                    }

                }


            }
            if ((MONTH == 4) || (MONTH == 6) || (MONTH == 9) || (MONTH == 11)) {
                System.out.printf("YEAR = %d\n", YEAR);
                System.out.printf("YEAR = %d\n", MONTH);
                System.out.printf("입력하신 달의 날 수는 %d일입니다.", day[3]);
            }
        }
    }
}




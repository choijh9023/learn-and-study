package Jungol.Loop2;

import java.util.Scanner;

public class Loop130_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //입력 1번만 받는다. (포문밖에 입력)

        for (int i = 0; i < num; i++) {  // 출력을 입력 받음 만큼 하기위한 조건으로 하기위해 포문 적용
            System.out.println("JUNGOL");
        }

    }
}

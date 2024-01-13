package Jungol.Loop2;

import java.util.Scanner;

public class Loop543_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 2; //2 부터 순서대로 출력만 시켜주면 되기 때문에 변수에 2부터 할당하고 시작


        while (true) {
            System.out.printf(a + " ");
            a += 2;
            if (a > num) {
                break;  // 입력받는 수는 50이하로제한되어있다고 정해주었기 때문에  브레이크문 이렇게 작성 홀수든 짝수든 상관없음


            }


        }
    }
}

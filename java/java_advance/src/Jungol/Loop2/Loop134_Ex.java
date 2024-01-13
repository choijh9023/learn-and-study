package Jungol.Loop2;

import java.util.Scanner;

public class Loop134_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0; //홀수 합 정리
        int even = 0; //짝수 합 정리

        for(int i =0;i<10;i++){ // 10번의 반복을 위해
            int num = sc.nextInt();
            if(num%2==1){  // 홀수가 나왔을때 홀수 횟수추가
                odd++;
            }
            if(num%2==0){ //짝수가 나왔을때 짝수 횟수추가
                even++;
            }
        }
        System.out.printf("even : %d \n", even); // 짝수 합
        System.out.printf("odd : %d \n", odd); // 홀수 합


    }
}

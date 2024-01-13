package Jungol.Loop2;

import java.util.Scanner;

public class Loop132_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total =0; //총합을 위한 변수
        int num = sc.nextInt(); //입력 한번을 위한 변수
        for(  int i = 5;i<=num;i+=5){  // 5의 배수는 +5이기 때문에
                total+=i;               //실행문끝나고 증강식 안에 +=5를 넣어주었다.
        }                               // 실행문에는 total 안에 총합을 넣기위해 이렇게 넣어주었다.
        System.out.println(total);
    }
}

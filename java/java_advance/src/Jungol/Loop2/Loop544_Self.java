package Jungol.Loop2;

import java.util.Scanner;

public class Loop544_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력기 생성
        int total = 0; // 합을 넣기위한 변수를 밖에 선언, 할당, 초기화
        int num = sc.nextInt(); //한번의 입력을 받기위해 반복문 밖에 입력기, 선언, 할당, 초기화

        while (true) {
            total += num;  //total = total + num

            num += 1;


            if (num == 101) { //100으로 하지 않은 이유는 위에 연산이 필요하기 때문에

                break;
            }
        }
        System.out.println(total); //총합 출력
    }
}

package Jungol.Loop3;

import java.util.Scanner;

//1부터 100까지의 정수 중 한 개를 입력받아                      100 보다 작은 배수들을 차례로
//출력하다가                         10 의 배수가 출력되면                 프로그램을 종료하도록 프로그램을 작성하시오.
public class Loop141_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1; // 10 의 배수 연산을 위해 1~10까지 만들기

        int num = sc.nextInt();

        for (int i = num; i * count < 100; count++) { //조건식은 100보다 작은 수로 표현해야해서 i*count<100으로 기입
                                                    //증감식은 10의 배수까지 차례대로 출력하기위해 1부터 증감시작
            System.out.printf("%d ", i * count);
            if ((i * count) % 10 == 0) { //10의 배수가 나왔을때  출력후 프로그램을 중단해야 하기때문에 10으로 나누었을떄 몫이 0이 나올때 브레이크
                break;
            }             // 조건식을 저렇게 만들고 증감식에서 count 변수를 1씩 증가시켜주었다.
            // 그리고 출력문에서 연산을 바로출력
        }
    }

}


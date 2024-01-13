package Loop1;

import java.util.Scanner;

//먼저 생각할것
//인간에게 당연한 것은 컴퓨터에게 당연한 것이 아니다
//반복을 부탁할 것과 멈추어야 하는 조건
//그리고 내가 필요한 것들을 알려줘야하고
//필요한것들을 주는 방식까지도 알려줘야한다.
public class Loop125_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1; //출력문에 출력할 숫자를 위해 그리고 제어문 작성을 위한 변수 선언 및 초기화
        int a = sc.nextInt(); //1번의 입력을 받기위해 WHILE(TRUE)밖에 작성

        while (true) { //반복시작

            System.out.print(num + " ");
            num += 1; //제어되기까지의 반복조건
            if (num > a) { //제어조건문 작성
                break;
            }


        }
    }
}
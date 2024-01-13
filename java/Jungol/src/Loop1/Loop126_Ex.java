package Loop1;

import java.util.Scanner;

public class Loop126_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOdd = 0; //홀수갯수변수
        int countEven = 0;//짝수갯수변수

        while (true) { //무한반복 시작
            int num = sc.nextInt(); //무한입력

            if (num == 0) { //제어문 조건 작성

                System.out.printf("odd : %d \n", countOdd);
                System.out.printf("even : %d \n", countEven);
                break; // 처음에 브레이크문을 아래에 위치했다가 0을 짝수로 계속 인식되어서 연산을 바꿀까 하다가 브레이크문을 위로 올려버렸다.
            }
            if ((num % 2 == 0)) { //짝수조건 기입 및 갯수 1씩증가
                countEven++;

            } else { //홀수 조건 기입 및 갯수 1씩증가
                countOdd++;  //if -else 구문으로 한번 작성해보았다.
            }

        }

    }

}


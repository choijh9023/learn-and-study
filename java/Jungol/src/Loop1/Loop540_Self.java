package Loop1;

import java.util.Scanner;

public class Loop540_Self {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력기생성
        int a = 0; // 입력기num변수에서 3의 배수가 나올경우 3으로 나눈 몫을 출력 하기위한 변수

        while (true) {
            int num = sc.nextInt(); // 입력을 위한 변수
            a = (num / 3); // 3으로 나눈 값 만들기위해 연산 적용


            if (num == -1) { // -1이 나오면
                break; //중지
            }
            if (num % 3 == 0) { //3의 배수가 나왔을 경우를 만들기 위해 이프문 작성
                //조건문 3의 배수가 나왔을때를 찾아야하는데 그 조건은 3의 배수는 3으로 나누면 나머지는 0이된다.
                //그때 a변수 출력
                System.out.println(a);
            }

        }
    }
}

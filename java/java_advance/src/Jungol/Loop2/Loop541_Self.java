package Jungol.Loop2;

import java.util.Scanner;

public class Loop541_Self {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //입력기 기입
        char code = sc.next().charAt(0);     //문자타입 변수 code
                                                // 0번째에 오는 요소를 문자로 받는다.
                                                // 1번으로 계속 찾는것같은느낌이다? string이 없어서인가


        for (int a = 0; a < 20; a++) { //int type에 할당과 초기화 /  a가 20미만일때까지 반복(총20번) / 실행 후 a에 후치로 +1을해준다

            System.out.print(code); //문자타입 변수 code 를 출력한다 포문이 끝날때까지
        }                           //for 문 끝

    }
}


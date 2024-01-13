package String;

import java.util.Scanner;

public class String9112_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;  //문자열의 길이를 받을 변수(필드?) 생성

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", str.length()); // 어느배열의 길이를 표현할떈 배열이름.length() 메소드사용
        i = str.length(); //문자열의 길이를 i변수에 넣는다.
        for (int a = i - 1; a >= 0; a--) {          // 포문 초기화에 문자열 총 길이변수-1을 넣는다
            System.out.print(str.charAt(a));        //why? 배열은 0부터 시작하기때문에 배열자리수가 6개면 마지막 인덱스자리수는 5다.
        }                                           //그렇기에 조건식에도 0이 출력되어야 하기때문에  >=(이상) 비교연산자기입
    }
}

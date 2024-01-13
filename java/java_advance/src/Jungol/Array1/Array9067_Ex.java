package Jungol.Array1;

import java.util.Scanner;

public class Array9067_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]intArray = new int[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = sc.nextInt();
        } // 정수 10개 입력
        System.out.printf("%d %d %d",intArray[2],intArray[4],intArray[9]);
        //쉬운 문제를 어렵게 생각한다. 일단 단순하게 생각하려고 노력해보자
        // 단순하게 자릿수에 위치한 값을 출력하는 프로그램이다.
        //배열은 그 위치를 선택해서 출력하는것은 충분히 출력할 수 있다.
        // 그 위치에 해당하는 인덱스값을 적으면 그만이다.




    }
}

package Jungol.Loop3;

import java.util.Scanner;

public class Loop149_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd = 1; //문제가 복잡해 보이지만 간단한 문제다 자연수만큼의 크기의 행렬을 만들고 그 안에 10미만의 숫자로 채워넣어주면 된다.
                    // 포문 밖에 메인함수에 홀수변수를 선언해준다. // n * n 이라고문제에 적혀있길래.. 안에서 주사위까지 굴렸는데
        for (int i = 0; i < num; i++) {     // 단순한 문제였다.
            for (int j = 0; j < num; j++) {        //포문 안에서 홀수의 값을 넣어주고 추가하면서 10미만의 범위를 넘어가면 다시
                System.out.print(odd + " ");        // 1로 초기화해서 포문안에서 반복해준다.
                odd += 2;
                if (odd == 11) {
                    odd = 1;
                }

            }
            System.out.println();


        }

    }
}
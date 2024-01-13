package Loop3;

import java.util.Scanner;

public class Loop551_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) { // 출력문에 변화가 생기는 공백과 별을 위한 변수창출 및  행렬 만들기
            for (int a = 0; a < (num - num) + i; a++) { //공백출력을 위해 0 부터 n의 값까지 표현되는값
                System.out.printf(" ");                 //을 구해야 했다
            }
            for (int j = 0; j < num - i; j++) {  //별 출력을 위해 n부터 1씩 줄어드는 변수를 조건식에 넣어줘야했다.
                System.out.printf("*");

            }System.out.println();

        }
    }
}

package Loop2;

import java.util.Scanner;

public class Loop138_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 입력기 생성
        //num 숫자만큼 행열을 만들어야 하기때문에 조건식에 num을 넣어서 행과 열조건을 만들고
        //증감식에 i++,j++을 넣어서 출력물 조건을 생성
        // 출력문에 i와 j를 넣어서 출력시작   why?  i와  j는 계속 증감을 진행한다 포문이 끝날떄까지
        for (int i = 1; i <= num; i++) { //아직완벽하게 숙지하지는 못했지만
            for (int j = 1; j <= num; j++) {  //어느정도 이해는 가기 시작하고있다.
                System.out.printf("(%d, %d) ", i, j);     // 행렬 구조로 크게 그림으로 생각하고
            }
            System.out.println();                      //진행하면 될거같다.
        }

    }
}

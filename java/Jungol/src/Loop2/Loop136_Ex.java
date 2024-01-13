package Loop2;

import java.util.Scanner;

public class Loop136_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력기 생성
        int num = sc.nextInt(); //1번의 입력
        for(int i =1;i<=10;i++){ // 10번의 반복

            System.out.printf("%d " ,num*i); //출력시 연산을 위한 num*i

        }
    }
}

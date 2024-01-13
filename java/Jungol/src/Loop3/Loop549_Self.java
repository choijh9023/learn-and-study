package Loop3;

import java.util.Scanner;

public class Loop549_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0; // 더한 값 출력하기위해 변수 선언 할당 초기화(메인함수에)
        int odd = 0; //홀수를 체크하기 위한 변수

        for(int i =0;i<num;i++){
            if(i%2==1){ //홀수의 경우를 찾기위한 반복
                odd++;
                total+=i;
            }


            if(total>=num){break;}
        }
        System.out.printf("%d %d",odd ,total);
    }
}

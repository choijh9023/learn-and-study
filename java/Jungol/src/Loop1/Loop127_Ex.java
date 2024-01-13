package Loop1;

import java.util.Scanner;

public class Loop127_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //평균을 연산하기  위한 변수
        int sum = 0;    //총점을 위한 / 평균을 연산하기 위한 변수
        double avg = 0; //평균을 출력하기 위한 변수

        while(true){
            int num = sc.nextInt(); // 무한 입력
            if((num<0)||(num>100)){  //제어문 작성
                break;}
            count++; //평균연산을 위해 후치연산자 적용
            sum+=num; //총합을위해 대입연산자 적용


        //arrays, intstream으로 변경해보아야 한다. 

        }avg = (double)sum/count; //평균값 만들기 위해 변수 재선언
        System.out.printf("sum : %d\n" , sum);
        System.out.printf("avg : %.1f", avg);
    }
}

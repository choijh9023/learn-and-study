package Jungol.Array1;

import java.util.Scanner;

public class Array9071_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] intArray = new int [10];
        int oddMin = 0;
        int EvenMax = 0;


        for (int i = 0; i < 10; i++) { //입력을 위한 포문
            intArray[i]= sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if(intArray[i]%2==0) {  //가장 큰 짝수를 구하기 위한 이프문
                EvenMax = Math.max(intArray[i],EvenMax);  //Math클래스안에 여러가지 메소드를 알았다. max는 두개를 비교해서
            } else if(intArray[i]%2!=0){    //              //큰값을 옮겨준다. 삼항연산자와 같은 기능
                oddMin = Math.min(intArray[i],oddMin);      //min는 두개를 비교해서 작은값을 옮겨준다. 삼항연산자와 같은 기능
        }                           //가장 작은 홀수를 구하기 위한 이프문 %2==1 로 안한 이유는 음수를 나누었을때 안해주는 이유를
                                    //수학적으로 잘 모르겠다. 그래서 이렇게 조건식을 만들었다. (짝수가 아닌 경우중 가장 작은 수)

    }   System.out.printf("%d %d", oddMin,EvenMax);
}}

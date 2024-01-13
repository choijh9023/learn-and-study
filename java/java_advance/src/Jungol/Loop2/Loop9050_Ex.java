package Jungol.Loop2;

import java.util.Scanner;

public class Loop9050_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //10을 받는다고 치자
        int total = 0;
                        // total 변수를 하나 별도로 만들어 줘서 깔끔하게 풀 수 있었다. (변수 선언 할당 초기화의 중요성)굉장히 편하다
                        //생각보다 쉬운 문제 였는데 생각하는 순간이 좀 오래걸렸다.
        for (int a = 0; a <= num; a++) {
            total+=a; //  a= a + 1 = 2




            }System.out.println(total);
        }


    }


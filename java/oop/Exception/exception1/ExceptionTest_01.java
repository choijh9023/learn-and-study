package oop.Exception.exception1;

import java.util.Scanner;

/*//실습1) 요소가 5개인 정수형 배열을 만들고 , 요소에 0~4를 대입하는 코드.
      배열 크기가 5이므로 정수 값을 5개 저장할 수 있다.
      6개요소를 입력하여 발생하는 에러를 확인해주세요*/
public class ExceptionTest_01 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        int[] arr = new int[5];
        ArrayIndexChech(arr);
        System.out.println("[프로그램 종료]");


    }
static void ArrayIndexChech(int[] array){
        try{
        for (int i = 0; i < array.length+1; i++) {
            array[i] = sc.nextInt();
        }
            for (int i : array) System.out.println(i); {

            }

    }catch (ArrayIndexOutOfBoundsException e){ //예외처리로 개발자만 알도록 exception 처리해주고  프로그램 종료까지 진행
            e.printStackTrace();
        }
} // 예외처리는 프로그램이 비정상 종료되는 것을 방지하는 중요한 역할을 한다.
}


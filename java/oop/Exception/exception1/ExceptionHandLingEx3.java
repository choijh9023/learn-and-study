package oop.Exception.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*//실습1) 요소가 5개인 정수형 배열을 만들고 , 요소에 0~4를 대입하는 코드.
      배열 크기가 5이므로 정수 값을 5개 저장할 수 있다.
      6개요소를 입력하여 발생하는 에러를 확인해주세요*/
public class ExceptionHandLingEx3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        FileInput();
        System.out.println("[프로그램 종료]"); //예외가 발생해도 종료 되지 않도록 try-catch 한다


    }

    static void FileInput() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("data.txt");
            System.out.println("파일 읽기 완료");
            //예외처리로 개발자만 알도록 exception 처리해주고  프로그램 종료까지 진행
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재 하지 않습니다. 확인해주세요");
            return;
        } finally {
            try {
                if (fis != null) fis.close();

            }
            catch (IOException io1) {
                io1.printStackTrace();
            }
            System.out.println("finally문은 항상 수행됨");
        }
        System.out.println("예외처리 후 수행됨");

    } // 예외처리는 프로그램이 비정상 종료되는 것을 방지하는 중요한 역할을 한다.
}


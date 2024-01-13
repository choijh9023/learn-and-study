package oop.Exception.exception1;

public class ExceptionHandLingEx1 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("자바 프로그램입니다.");
        printLength(null);
        System.out.println("[프로그램 종료]"); //예외가 발생해도 종료되지 않도록 try-catch로 예외처리함
    }

    static void printLength(String s) {
        try {
            int result = s.length();
            System.out.println("문자 수 " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); //예외 출력방식 1 ( 개발자가 보는 형태) : 에러의 원인을 간단하게 출력
            System.out.println("입력 데이터가 잘못되었습니다. 다시 입력해 주세요!"); // 예외 출력반식2
            System.out.println(e.toString()); //예외 출려방식 2 :Exception의 내용과 원인출력
            e.printStackTrace(); //예외처리 출력방식 3  (개발자가 보는 형태) : 에러의 발생 근원지를 찾아 단계별로 에러를 출력
        }       //printStackTrace
    }

}

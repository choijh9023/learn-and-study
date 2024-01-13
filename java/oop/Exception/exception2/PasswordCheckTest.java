package oop.Exception.exception2;

import java.util.Scanner;

public class PasswordCheckTest {
    static Scanner sc = new Scanner(System.in);


    public String password;

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) throws PasswordCheckException {

        if (password == null) {
            throw new PasswordCheckException("비밀번호를 알 수 없습니다");
        } else if (password.length() <= 5) {
            throw new PasswordCheckException("비밀번호는 5자 보다 많아야 합니다");
        } else if (password.matches("[^a-zA-Z0-9]+")) {
            throw new PasswordCheckException("비밀번호는 영문자와 숫자로 제한합니다");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordCheckTest test = new PasswordCheckTest();
        String password = null;
        try {
            password = sc.next();
            test.setPassword(password);
        } catch (PasswordCheckException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생 프로그램 다시 시작 ");

        }
        System.out.println("회원 가입 완료 ");

    }
}



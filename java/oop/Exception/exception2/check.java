package oop.Exception.exception2;

import java.util.Scanner;

public class check {
    static Scanner sc = new Scanner(System.in);


    public String password;
    private String userID;

    public String getPassword() {
        return password;
    }

    public String getUserID() {
        return userID;
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



    public void setUserID(String userID) throws IDFormatException {
        //IDFormatException이 처리해!!
        if (userID == null) {
            throw new IDFormatException("아이디는 null 일 수 없습니다.");

        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 , 20자 이하만 가능합니다.");

        }
        this.userID = userID;
    }



    public static void main(String[] args) {
        check check = new check();
        System.out.println("회원가입할 id를 입력하세요");
        String password = null;
        String userID = null;

        try {
            password = sc.next();
            check.setPassword(password);
        } catch (PasswordCheckException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생 프로그램 다시 시작 ");

        }
        System.out.println("아이디 입력 완료 ");
        System.out.println("비밀번호를 입력하세요 ");
        try {
            userID = sc.next();
            check.setUserID(userID);
        } catch (IDFormatException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생 프로그램 다시 시작");
        }
        System.out.println("회원가입 완료");
    }


}



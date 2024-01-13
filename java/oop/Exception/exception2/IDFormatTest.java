package oop.Exception.exception2;

import java.util.Scanner;

public class IDFormatTest {
    static Scanner sc = new Scanner(System.in);

    public String getUserID() {
        return userID;
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

    private String userID;

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userID = null;
        try {
            userID = sc.next();
            test.setUserID(userID);
        } catch (IDFormatException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생 프로그램 다시 시작");
        }
        System.out.println("회원가입 완료");
    }
}
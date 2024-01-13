package oop.Exception.exception2;

import java.util.Scanner;

public class LoginExample {
    static Scanner sc = new Scanner(System.in);

    String ID = "CHOI";
    String password = "1234";

    public void loginExample(String ID,String password)throws IDcheckException, PasswordCheckException{
       // this.ID=ID;
       // this.password=password;

        try{
        if(!ID.equals(this.ID)){

                throw new IDcheckException("회원가입 이력이 없는 아이디입니다.");

        }}catch (IDcheckException e){
            System.out.println(e);

        }
        if(!password.equals(this.password)){
            throw new PasswordCheckException("비밀번호가 일치하지 않습니다.");
        }
        System.out.println("로그인이 완료 되었습니다.");
    }

    public static void main(String[] args) throws PasswordCheckException, IDcheckException {
        System.out.println("아이디를 입력해주세요뿌잉 ");

        String id  = sc.next();
        System.out.println("비밀번호를 입력해주세요뿌잉 ");
        String pass = sc.next();
        LoginExample loginExample = new LoginExample();
        loginExample.loginExample(id,pass);

    // 이것은 나중에 하자

    }
}

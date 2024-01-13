package oop.day4.inher;

public class ParentCat {
    protected String breed;

    ParentCat(){} //기본생성자
    ParentCat(String breed){
        super(); // 상속에 관한 메소드다. 어느 클래스의 메소드지? extend?

    }

    public void eat(){
        System.out.println("냠냠 먹이를 먹다");

    } //()가 붙으면 void가 붙는다??

    public  String getBread(){
        return breed;
    }
}

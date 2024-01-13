package oop.day4.inher.Family;

public class SubSon extends SubFather {
    SubSon(){
        super();

    }

    public void printSon(){

        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속받습니다.");
        printFather();

    }
}

package oop.day4.inher.Family;

public class Grandfather {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Grandfather(){}
    public void printGrandFather(){
        System.out.println("나는 할아버지입니다.");
    }
}

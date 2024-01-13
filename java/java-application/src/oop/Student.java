package oop;

public class Student {
    public String name;
    public String major;

    public void study(){
        int studyE = 0;
        studyE++;
        System.out.println("학습 능력이 1+ 상승했습니다.");
    }

    public String eat(String food){

        return  food + " 맛있게 냠냠!";
    }
}
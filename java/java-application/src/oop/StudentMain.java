package oop;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s1.name ="홍길동";
        s1.major = "컴퓨터공학";
        s1.study();
        s1.eat("짜장면");
        System.out.println(s1.name + "학생이" + s1.eat("짬뽕") + "먹었다");

        s2.name = "김진아";
        s2.major = "건축학";

        System.out.println(s1.name + s2.major);
        System.out.println(s2.name + s2.major);
    }
}

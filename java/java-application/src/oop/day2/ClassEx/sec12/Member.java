package oop.day2.ClassEx.sec12;

public class Member {
    String name;
    String id;
    String password;
    int age;
    Member(){}
    Member (String name){
        this("최문석","choijh9023","90239023",33);
    }

    public Member(String name, String id, String password, int age){
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;

    }
}

package Ex;

public class Student { //클래스 객체 생성

    int id; //필드 선언
    String name;
    public Student() {
           //기본 생성자
    }
    public Student(int parm1,String parm2) {
        //기본 생성자
    }

    void isertRecord(int ids, String par) {
        id= ids;
        this.name= par;
    }
    void printinfor() {
        System.out.println(id);
        System.out.println(name);
    }
//    Student(int id,String name){
//        id = id;
//        name = name;
//    }

}


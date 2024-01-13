package Comparable_Comparator;

import java.util.Comparator;

//Student 클래스가 있다.
//5명의 학생들의 정보를 관리하기 위해
//Student 배열을 생성하여, 학번순으로 정렬해서 나타내고자 한다.  Comparable을 이용하여 정렬하세요
public class Student implements Comparable<Student>{
    String name; //이름
    int id; //학번
    double score; //학점
    public Student(String name, int id, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public String toString(){ //출력용 toString오버라이드
        return "이름: "+name+", 학번: "+id+", 학점: "+score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id,o.id); // return this.id - o.id; 이렇게 작성해도 되는데 우리는 객체를 관리할것이기 때문에 인티저로하는것이 좋다 why? 힙에 저장해야 하기 때문에
    }
    // 아직 컴페어러털 이해가 안됨

    //이 부분 이해를 더 확실하게 해야 한다
    public static final Comparator<Student> COMPARATOR =
            Comparator.comparingDouble((Student student) -> student.score).reversed().thenComparingInt(student -> student.id);
}

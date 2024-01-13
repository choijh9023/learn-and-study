package Comparable_Comparator;

public class Student1 implements Comparable<Student1>{
    String name; //이름
    int id; //학번
    double score; //학점

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return this.id - o.id;
    }
}

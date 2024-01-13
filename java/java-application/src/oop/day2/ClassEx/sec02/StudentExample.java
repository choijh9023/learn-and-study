package oop.day2.ClassEx.sec02;

public class StudentExample {
	public static void main(String[] args) {
    //1. Student 타입의 학생객체를 생성 하세요
    Student Student = new Student();
    //2. 학생 클래스 변수의 주소값을 출력하세요
		System.out.println(Student); //앞에 출력문은 .toString이 삭제된거라고 보면된다.
	}											//.toString()을 사용 하면 .앞에 있는 정보들을 읽어온다고 보면된다.
}												//System.identityHashCode(student)이렇게도 가능하다.
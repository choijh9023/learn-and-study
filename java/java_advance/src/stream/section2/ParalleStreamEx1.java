package stream.section2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//24년 1월 10일 오후 수업 신세계 백엔드
public class ParalleStreamEx1 {
    //List 컬렉션의 내부 반복자를 이용해서 병렬처리를 하는 방법
    //parallelStream() : 병렬 처리 스트림
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김진성", "강호동동동", "백종우", "이도엽", "문지환");
        //위에 것을 병렬처리한는 코드 아래에 작성
        Stream<String> paralelStream = names.parallelStream();
        paralelStream.forEach(name-> {
                    System.out.println(name + " : " + Thread.currentThread().getName());
        }
        );
        List<Student> students = Arrays.asList(new Student("최문석",80),
                new Student("백정훈",90),
                new Student("백종우",95),
                new Student("문지환",100),
                new Student("이도엽",95));
        Student stu1 = new Student("정휘제", 99);
        Student stu2 = new Student("윤호상", 93);
        List<Student> stulist = Arrays.asList(stu1, stu2);
        for (Student student : stulist) {
            System.out.println("stulist를 돌면서 출력");
            System.out.println("sutlist 학생 이름 :" +student.getName());
            System.out.println("sutlist 학생 점수 :" +student.getScore());

        }
    double avg = students.stream().mapToInt(student-> student.getScore()).average().getAsDouble();
        System.out.println("평균은 = "+avg);
        long count = students.stream().mapToInt(student ->student.getScore()).count();
        System.out.println("카운팅은 = " +count);
        int sum = students.stream().mapToInt( student -> student.getScore()).sum();
        System.out.println("총합은 ="+sum);
        //위에까지가 내가 짠 코드

        //스트림 객체 생성해서 하는방법 => 정석적인 방법
        Stream<Student> studentStream = students.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double average1 = scoreStream.average().orElse(0);
        System.out.println("두번째 방법 평균 =" + average1);

        //mapToDouble을 사용한 방법
        double avarage2 = students.stream().mapToDouble(student -> student.getScore()).average().getAsDouble();
        System.out.println(avarage2);

        //여러가지 사용 방법이 있다.
    }

}

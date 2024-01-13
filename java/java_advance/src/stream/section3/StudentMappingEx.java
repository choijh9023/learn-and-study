package stream.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//24년 1월 11일
public class StudentMappingEx {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //1. Student 클래스 타입의 stulist 리스트 컬랙션을 생성하세요
        //2. Scanner 클래스로 학생의 이름과 성적을 입력받아 5명의 학생 객체를 stulist에 저장하세요
        List<Student> stulist = new ArrayList<>();
        while (true) {
            System.out.println("학생의 이름을 입력하시오");
            String name = sc.nextLine();
            System.out.println("학생의 국어점수를 입력하시오");
            Integer korscore = Integer.parseInt(sc.nextLine());
            System.out.println("학생의 수학점수를 입력하시오");
            Integer mathscore = Integer.parseInt(sc.nextLine());
            System.out.println("학생의 영어점수를 입력하시오");
            Integer engscore = Integer.parseInt(sc.nextLine());

            stulist.add(new Student(name, korscore, mathscore, engscore));
            long a = stulist.stream().count();
            if (a == 5) {
                break;
            }

        }
        //네임 리스트
        List<String> nameList = stulist.stream().map(student -> student.getName()).collect(Collectors.toList());
        //4.국어 점수 리스트
        // System.out.println(nameList);
        List<Integer> korScorelist = stulist.stream().map(student -> student.getKorscore()).collect(Collectors.toList());
        //   System.out.println("국어 점수 총합 "+korlist.stream().mapToInt(Integer::intValue).sum());
        //5. 국어 총합 평균 구하는 출력
        System.out.println("전체 국어 점수의 총합 = " + stulist.stream().mapToInt(student -> student.getKorscore()).sum());
        System.out.println("전체 국어 점수의 평균 = " + stulist.stream().mapToDouble(student -> student.getKorscore()).average().getAsDouble());
        //6. 학생별 영어 점수를 저장한 engScoreList 만들고 출력
        List<Integer> engScorelist = stulist.stream().map(student -> student.getEngscore()).collect(Collectors.toList());
        //7.영어 총합 평균 구하는 출력
        System.out.println("전체 영어 점수의 총합 = " + stulist.stream().mapToInt(student -> student.getEngscore()).sum());
        System.out.println("전체 영어 점수의 평균 = " + stulist.stream().mapToDouble(student -> student.getEngscore()).average().getAsDouble());
        //8. 학생별 수학 점수를 저장한 mathScoreList 만들고 출력
        List<Integer> mathScorelist = stulist.stream().map(student -> student.getMathscore()).collect(Collectors.toList());
        //9.수학점수의 총합과 평균 구하기
        System.out.println("전체 수학 점수의 총합 = " + stulist.stream().mapToInt(student -> student.getMathscore()).sum());
        System.out.println("전체 수학 점수의 평균 = " + stulist.stream().mapToDouble(student -> student.getMathscore()).average().getAsDouble());
        //10.학생별 총합 점수와 평균을 구하여 total Exam에 저장하여 최종 성적표를 출력하세요
        System.out.println("번호 이름 국어 영어 수학 총점 평균 ");
        //람다 안에서는 상수를 변환 할 수 없다.
      /* List<Student> totalExam = stulist.stream().count() + " " +
                stulist.stream().map(student -> student.getName()) + " " +
                stulist.stream().map(student -> student.getKorscore()) + " " +
                stulist.stream().map(student -> student.getEngscore()) + " " +
                stulist.stream().map(student -> student.getMathscore()) + " " +
                stulist.stream().mapToInt(student -> student.getMathscore() + student.getEngscore() + student.getKorscore()).sum() + " " +
                stulist.stream().mapToDouble(student -> student.getKorscore() + student.getEngscore() + student.getMathscore()).average().getAsDouble());*/
// 조졋다 이건 모든게 다 출력 된다.


        /*stulist.stream().map(student -> {
            math = student.getMathscore();
            eng = student.getEngscore();
            totalEXam.add(new Student(math.eng))
        )}*/

        /*stulist.stream().map(student -> {
            totalexam.add (new Student(student.getName(), student.getKorscore()))
        })*/
        AtomicInteger i = new AtomicInteger(1); // 얘는 무엇이냐 알아서 연산을
        /**
         * Atomically increments the current value, with memory effects as specified by VarHandle.getAndAdd.
         * Equivalent to getAndAdd(1).
         * Returns:
         * the previous value
         */

        List<Student> totalExam = stulist.stream()
                .map(stu -> new Student(
                        i.getAndIncrement(),
                        stu.getName(),
                        stu.getKorscore(),
                        stu.getEngscore(),
                        stu.getMathscore(),
                        stu.getTotal(),
                        stu.getAvg()
                )).collect(Collectors.toList());
        totalExam.stream().forEach(student -> System.out.println(student.toString()));


    }
}

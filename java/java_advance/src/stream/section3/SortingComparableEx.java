package stream.section3;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class SortingComparableEx {
    public static void main(String[] args) {
        List<Student> stulist = new ArrayList<>();
        stulist.add(new Student("김나나",90));
        stulist.add(new Student("신지수",80));

        // 점수를 기준으로 오름차순 정렬한 새스트림 얻어오기
        System.out.println("오름차순 -------------------------------------");
        stulist.stream().sorted().forEach(str -> System.out.println(str.getName()  + " : " +str.getScore() ));

        //점수를 기준으로 내림차순
        System.out.println("내림차순 -------------------------------------");
       stulist.stream().sorted(Comparator.reverseOrder()).forEach(str -> System.out.println(str.getName()  + " : " +str.getScore() ));

        //만약 Compaarable 인터페이스가 구현되지 않은 구현체를 정렬하려면

        List<Student1> stulist2 = new ArrayList<>();
        stulist2.add(new Student1("김이이",90));
        stulist2.add(new Student1("신지아",80));

        System.out.println("---------------------------------------------");
        //점수를 기준으로 오픔차순으로 정렬한 새 스트림 생성
        stulist2.stream()
                .sorted((s1,s2) -> Integer.compare(s1.getScore() , s2.getScore()))
                .forEach(student1 -> System.out.println(student1.getName()  + " : " +student1.getScore()));

        //점수를 기준으로 내림차순으로 정렬한 새 스트림 생성
        stulist2.stream()
                .sorted((s2,s1) -> Integer.compare(s1.getScore() , s2.getScore()))
                .forEach(student1 -> System.out.println(student1.getName()  + " : " +student1.getScore()));

    }
}

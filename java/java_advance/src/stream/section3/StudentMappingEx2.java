package stream.section3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMappingEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student2> stuList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("이름, 영어 점수, 국어 점수, 수학 점수를 입력하세요.");
            String[] student = sc.nextLine().split(" ");
            stuList.add(new Student2(student[0], Integer.parseInt(student[1]), Integer.parseInt(student[2]), Integer.parseInt(student[3])));
        }
        List<String> nameList = stuList.stream().map(Student2::getName).toList();
        nameList.forEach(System.out::println);

        List<Integer> korSocreList = stuList.stream().map(Student2::getKorScore).toList();
        korSocreList.forEach(System.out::println);

        Integer korScoreTotal = korSocreList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("korScoreTotal: " + korScoreTotal);

        Double korScoreAverage = korSocreList.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
        System.out.println("korScoreAverage: " + korScoreAverage);

        List<Integer> engScoreList = stuList.stream().map(Student2::getEngScore).toList();
        engScoreList.forEach(System.out::println);
        Integer engScoreTotal = engScoreList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("engScoreTotal: " + engScoreTotal);
        Double engScoreAverage = engScoreList.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
        System.out.println("engScoreAverage: " + engScoreAverage);

        List<Integer> mathScoreList = stuList.stream().map(Student2::getMathScore).toList();
        mathScoreList.forEach(System.out::println);
        Integer mathScoreTotal = mathScoreList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("mathScoreTotal: " + mathScoreTotal);
        Double mathScoreAverage = mathScoreList.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
        System.out.println("mathScoreAverage: " + mathScoreAverage);

        List<Student2> totalExam = stuList;
        System.out.println("번호 이름 국어 영어 수학 총점 평균");
        for (Student2 student : totalExam) {
            System.out.println();
        }
        for (int i = 0; i < totalExam.size(); i++) {
            Integer no = i + 1;
            System.out.printf("%d %s %d %d %d %d %.2f\n", no,
                    totalExam.get(i).getName(),
                    totalExam.get(i).getKorScore(),
                    totalExam.get(i).getEngScore(),
                    totalExam.get(i).getMathScore(),
                    totalExam.get(i).getTotalScore(),
                    totalExam.get(i).getAverageScore());
        }
    }
}
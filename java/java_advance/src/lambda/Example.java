package lambda;



public class Example  {

    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신세계", 90, 56)};
    //5번문제
    public static double avg(Function <Student> function) {
        double sum = 0;
        for (Student student : students) {
            sum+= function.apply(student);

        }
    return sum/ students.length;}

    public static void main(String[] args) {

        double englishAvg = avg(s ->  s.getEnglishScore());
        System.out.println("영어 평균 점수 : " + englishAvg);


        // 6번문제
        englishAvg = avg(Student::getEnglishScore); // 매소드 참조형으로 변경


        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수 :" +mathAvg);

         mathAvg = avg(Student::getMathScore); // 매소드 참조형으로 변경


    }
}

package stream.section3;

public class Student implements Comparable<Student> {

    private Integer id;
    private String name;

    public Integer getScore() {
        return Score;
    }

    private Integer Score;
    private Integer korscore;
    private Integer mathscore;
    private Integer engscore;
    private Integer total;
    private double avg;


    public Student(String name, Integer score) {
        this.name = name;
        this.Score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getKorscore() {
        return korscore;
    }

    public Integer getMathscore() {
        return mathscore;
    }

    public Integer getEngscore() {
        return engscore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotal() {
        return korscore + engscore + mathscore;
    }

    public double getAvg() {
        return (double) getTotal() / 3;
    }





    public Student(String name, Integer korscore, Integer mathscore, Integer engscore) {
        this.name = name;
        this.korscore = korscore;
        this.mathscore = mathscore;
        this.engscore = engscore;
    }
    public Student(int id, String name, int korscore, int engscore, int mathscore, Integer total, double avg) {
        this.id = id;
        this.name = name;
        this.korscore = korscore;
        this.engscore = engscore;
        this.mathscore = mathscore;
        this.total = total;
        this.avg = avg;

    }


    @Override
    public String toString() {
        return  "번호 | 이름 | 국어 | 영어 | 수학 | 총점 | 평균\n"
                + id + "   " + name + "   "
                + korscore + "   " + engscore + "   "
                + mathscore + "   " + total + "   " + avg
                + "\n------------------------------------------";
    }

    public int compareTo(Student o) {
        return Integer.compare(Score,o.Score);
    }
}

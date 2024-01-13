package stream.section3;

public class Student2 {
    private String name;
    private Integer korScore;
    private Integer engScore;
    private Integer mathScore;
    private Integer totalScore;
    private Double averageScore;

    public Student2(String name, Integer korScore, Integer engScore, Integer mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
        scoreCalculator();
    }

    public void scoreCalculator() {
        this.totalScore = this.korScore + this.engScore + this.mathScore;
        this.averageScore = (double) (totalScore / 3);
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

    public Integer getKorScore() {
        return korScore;
    }

    public Integer getEngScore() {
        return engScore;
    }

    public Integer getMathScore() {
        return mathScore;
    }

}
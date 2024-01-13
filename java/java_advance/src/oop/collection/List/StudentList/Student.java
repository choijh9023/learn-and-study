package oop.collection.List.StudentList;

public class Student {

    private int stuno;
    private String name;
    int[] scores;

    Student(String name, int stuno) {
        this.name = name;
        this.stuno = stuno;
    }

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}
package oop.collection.app;

public class EX1 implements Comparable<EX1>{
    private int first;
    private int second;

    public EX1(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "("+first+"," +second + ")";}



    @Override
    public int compareTo(EX1 o) {
        int result = Integer.compare(first, o.first);

        return result;
}}

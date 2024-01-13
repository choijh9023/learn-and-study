package oop.collection.app;

import java.util.Comparator;

public class SampleNumberComparator implements Comparable<SampleNumberComparator>{

    private int first;
    private int second;
    private int third;

    public SampleNumberComparator(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "sampleNumber{" +
                "[first]=" + first +
                ", [second]=" + second +
                ", [third]=" + third +
                '}';
    }

    @Override
    public int compareTo(SampleNumberComparator o) {

        return COMPARATOR.compare(this,o);
    }

    private static final Comparator<SampleNumberComparator> COMPARATOR =
            Comparator.comparingInt((SampleNumberComparator number) -> number.first).thenComparingInt(number -> number.second) //비교생성 메서드 then Compari
                    .thenComparingInt(number -> number.third);
}

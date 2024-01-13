package oop.Generic;

public class Pair<T,U> {

    private T first;
    private U second;
    public Pair(T first,U second) {
        this.first = first;
        this.second = second;
    }

    public  void swap(T a, T b) { // T 여도 U는 안된다.
        a = b;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

package oop.Generic;

public class Pair2<T> {

    private T first;
    private T second;
   public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public  void swap() { // T 여도 U는 안된다.
        T temp = first;
        first = second;
       second = temp;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair2<Integer> intpair = new Pair2(1, 2);
        System.out.println(intpair.getFirst() + "," + intpair.getSecond());
        intpair.swap();
        System.out.println("======================");
        System.out.println(intpair.getFirst()+ ", " + intpair.getSecond());
    }
}

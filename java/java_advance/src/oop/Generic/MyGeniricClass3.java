package oop.Generic;

public class MyGeniricClass3 {
    public static <T> int count0ccurrences(T[] array, T element) {
        int count = 0;
        for (T item : array) {
            if (item.equals(element)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strArray = {"APPLE", " banana", " apple", "orange", "apple"};
        String target = "apple";
        int occrurrences = count0ccurrences(strArray, target);
        System.out.println(target + ", " + occrurrences);
    }
}

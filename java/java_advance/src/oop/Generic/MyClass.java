package oop.Generic;

public class MyClass {
    public static <T> void printArray(T[]array){
        for (T t : array) {
            System.out.println(t);
        }
    }
}

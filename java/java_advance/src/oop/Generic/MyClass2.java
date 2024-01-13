package oop.Generic;

public class MyClass2 {
    public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("===Before swap===");
        for (Integer i : intArray) {
            System.out.println(i + " ");
        }
        System.out.println();
        swap(intArray, 1, 3);
        System.out.println("===After swap===");
        for (Integer number : intArray) {
            System.out.print(number + " ");
        }
    }}



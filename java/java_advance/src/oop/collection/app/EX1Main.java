package oop.collection.app;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EX1Main {
    public static void main(String[] args) {
        List<EX1> ex1 = Arrays.asList(new EX1(10, 22), new EX1(15, 1)
                , new EX1(9, 15));

        Collections.sort(ex1);
        System.out.println(ex1);
        ex1.stream().forEach(number -> System.out.println(number.toString()));
    }
}

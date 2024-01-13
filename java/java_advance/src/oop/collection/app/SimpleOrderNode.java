package oop.collection.app;

import java.util.*;

public class SimpleOrderNode {
    public static void main(String[] args) {
        Node[] nodes = new Node[3];

        nodes[0] = new Node("one", 1);
        nodes[1] = new Node("two", 2);
        nodes[2] = new Node("three", 3);
        Arrays.sort(nodes);
        Arrays.stream(nodes).forEach(number-> System.out.println(number.toString()));
        List<SampleNumber> sampleNumbers = Arrays.asList(new SampleNumber(10, 22, 33),
                new SampleNumber(11, 23, 33)  ,
        new SampleNumber(10, 24, 34));

        sampleNumbers.stream().forEach(number -> System.out.println(number.toString()));
        System.out.println("===================================================");

        Collections.sort(sampleNumbers); // sampleNumbers 를 sort해줌( 정렬해줌 순서대로 )

        sampleNumbers.stream().forEach(number -> System.out.println(number.toString()));
    }
}

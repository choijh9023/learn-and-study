package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
        int [] arr = solution(2,10);
        for (int i : arr) {
            System.out.println(i);
        }


    }
    static int[] solution ( int start_num, int end_num){


        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}


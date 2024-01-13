package stream.section3;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        //1.정수형 배열 intArray 1,2,3,4,5 초기화 하여 생성하세요
        int[] intArray = {1, 2, 3, 4, 5};

        //2. inArray를 intStream으로
        IntStream intstream = Arrays.stream(intArray);
        //3. intStream DoubleStream
       // DoubleStream doubleStream = intstream.asDoubleStream();
        intstream.asDoubleStream().forEach(System.out::println);
        System.out.println("------------");

        intstream = Arrays.stream(intArray);
        intstream.boxed().forEach(obj -> System.out.println(obj.intValue())); // 이거 굳이 인트밸류 왜들어가는거지?
    }
}

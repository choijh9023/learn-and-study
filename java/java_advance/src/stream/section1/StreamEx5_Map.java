package stream.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx5_Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "pear", "orange", "banana", "tomato");
        //list 문자열을 대문자로 변환하여 출력하세요
        list.stream().map(String::toUpperCase).forEach(System.out::print);
        //list 문자열을 소문자로 변환하여 출력하세요
        list.stream().map(String::toLowerCase).forEach(System.out::print);
        list.stream().forEach(System.out::println);

        //1. of 메소드를 이용하여 직접 입력해 입력 스트림을 만들 수 있습니다.
        //2. 합계를 구하는 최종연산을 합니다
        int total = IntStream.of(1, 2, 3, 5, 7, 9).sum();
        System.out.println(total);

        //3. 스트림 데이터 개수를 세는 최종 연산을 합니다
        long count = IntStream.of(3,5,6,7,8,10,11,2,213,124).count();
        System.out.println(count);
        //4. 스트림 데이터 평균을 구하는 최종 연산을 합니다
        double avg1 = IntStream.of(1,2,3,4,34,5345,43,324,13).average().orElse(0.0);
        System.out.println(avg1);
        ////5. 최종연산 결과를 변수로 받지 않고 결과가 존재한다면 출력하는 처리를 합니다 @@@@@ifPresent@@@@@ 는 결과가 없으면 출력을 안한다.
        IntStream.of(1,23,13,123,13,34,23423,4).average().ifPresent(avg -> System.out.println("average :"+ avg));

        //6.스트림 데이터의 최솟값을 구하는 최종연산
        IntStream.of(1,2,3,5,6,4,3,2,3,2,5,4).min().ifPresent(min -> System.out.println("최솟값 : " + min));
        //7. 스트림 데이터의 최대값을 구하는 최종연산
        IntStream.of(1,2,3,45,345,34,2,323,5,4,6).max().ifPresent(max -> System.out.println("최대값 :" + max));
        IntStream.of(1,2,3,45,345,34,2,323,5,4,6).max().ifPresent(max -> System.out.println("최대값 :" + max));

        //마지막 문제
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 33, 22, 20, 7, 8);

      //  int total2 = IntStream.of(numbers).sum();//이유를 찾고 해결하고 슬랙제출 후 점심먹기 -> 이유는 numbers는 리스트이기때문에 형이 달라서안들어감
       //해결책 1
        int total3 = numbers.stream().mapToInt(Integer::intValue).sum();


    }

    public static IntStream of(int... values) {
        return Arrays.stream(values);
    }
}

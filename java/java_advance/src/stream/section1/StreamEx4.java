package stream.section1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//24년 1월 10일 수업
public class StreamEx4 {
    public static void main(String[] args) {
        //1. sorted() : 스트림을 ㄱ구성하는 데이터를 조건에 따라 정렬하는 연산

        List<String> stringList = Arrays.asList("홍길동 제주도 도망 ", "풍자 먹찌빠", "강호동 아는형님", "유재석 유퀴즈 온더 블록", "서장훈 미운오리새끼", "신동엽 토요일 즐겁다");
        //2. stream 객체로 변환하여 사전순으로 정렬해 주세요 .
        stringList.stream().sorted().forEach(n -> System.out.println(n + "\t"));
        stringList.stream().sorted().forEach(System.out::println);
        Stream<String> stm1 = stringList.stream();
        stm1.sorted().forEach(System.out::println);
        System.out.println(stringList.stream().sorted(Comparator.comparing(str -> str)).collect(Collectors.toList()));
        List<String> collect = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);


        //3. stream객체로 변환하여 글자 길이순으로 정렬해 주세요
        stringList.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).forEach(System.out::println);
        stringList.stream().sorted((s1, s2) -> s2.length() - s1.length()).forEach(System.out::println); // 역순으로 출력
        stringList.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
        List<String> newList = stringList.stream().sorted(Comparator.comparing(str -> str.length())).collect(Collectors.toList());
        List<String> newList2 = stringList.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(newList);
        for (String s : newList) {
            System.out.println(s);
            System.out.println(newList2);
        }
    }
}

package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
24년 1월 9일 오후 2시 30분 신세계 수업
람다 메서드 유형별 참조 사용법
*/
public class LambdaEx7 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog", "cat", "elephant", "rabbit");
        //이 문자열을 오름차순으로 정렬하려고 한다.
        //람다로 처리 할 것
        Collections.sort(strings,(s1,s2) ->s1.compareTo(s2));
        Collections.sort(strings,String::compareTo);
        System.out.println(strings);

        //2. 정수 리스트 스트리밍 하기, Integers 대상으로 모든 짝수의 합을 구하는 식
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       int evenTotal =  integers.stream().filter(n -> n%2==0).mapToInt(i -> i.intValue()).sum();

        System.out.println(evenTotal);
        int evenTotal1 =  integers.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum();

        String[] str1 = {"aaa", "bbb", "ccc"};
        // Collection List 컬렉션으로 변경 -> 29번쨰줄
        List<String> stringList = Arrays.asList(str1);
        //stringList 스트림 객체 생성
        Stream<String> stringStream = stringList.stream();
        Stream<String> str1Stream = Arrays.stream(str1);
        //스트림 출력
        System.out.println("-----------------------");
        stringStream.forEach(System.out::println);
        System.out.println("-------------------");
        str1Stream.forEach(System.out::println);


        //스트림은 데이터 소스로부터 데이터를 읽기만 할뿐, 변경하지 않는다.
        //한번 사용하면 닫혀서 다시 사용할 수 없다.
        //스트림 작업은 내부 반복으로 처리한다.
    }}

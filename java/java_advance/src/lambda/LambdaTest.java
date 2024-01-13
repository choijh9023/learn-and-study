package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        //1. 제시되는 list를 오름차순으로 정렬하는 람다식을 작성하세요
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange");
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
        System.out.println(list);
                //2.문자열을 대문자로 변환하는 람다 표현식 작성
        List<String> upperCaseNames = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseNames);

        //3. 문자열이 비어 있는지 확인하는 람다 표현식 작성

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));


        //4. 두 문자열을 연결하는 람다 표현식을 작성
        // 문자열 연결하는 코드
        BiFunction<String, String, String> concatename = String::concat;
        System.out.println(concatename.apply("자바 신세계", "신세계"));

       /* String stringSum = list.stream().reduce(String.valueOf(""), (x, y) -> x + y);
        System.out.println(stringSum);*/ // 이게 내가 짠 코드

        //5. 숫자의 제곱을 계산하는 람다 식 작성
        // 내가 작성한 코드
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> calculator =  integers.stream().map(n -> n*n).collect(Collectors.toList());
        //강사님이 작성한 코드

        Function<Integer,Integer> square = (n) -> n*n;
        System.out.println(square.apply(5));
        System.out.println(calculator);
    }
}

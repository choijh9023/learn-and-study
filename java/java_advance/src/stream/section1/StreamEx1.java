package stream.section1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        //1. 정수형 배열 array 생성하고 1,2,3,4,5 초기화
         Integer [] integers = {1,2,3,4,5};
         int [] intarr = {1,2,3,4,5};
        //2.배열에 스트림 객체 stm1을 생성하세요.
        Stream<Integer> stm1 = Arrays.stream(integers);
        Stream<Integer> stm111 = Arrays.stream(intarr).boxed(); // boxed()는 여기서 int를 Integer로 형변환해주는 메소드다
        //IntStream stm111 = Arrays.stream(intarr);
        //3. 중간연산 스트림 객체 stm1 에 대해 홀수만 추출하여 스트림 객체 stm2에 저장하세요

       Stream<Integer>stm2 = stm1.filter( n -> n%2 ==1 );
        Stream<Integer> stm22 = stm111.filter(n -> n % 2 == 1);
        //4. smt2 스트림 객체의 총합을 구하세요.
       long a = IntStream.range(1,4).count(); // -> 이 뜻은 1부터 3까지의 값을  생성하는 뜻이다.
        System.out.println(a);  // 그래서 카운트를 해보면 a는 3이 된다.

        int sum = stm2.mapToInt(Integer::intValue).sum();
        int total = stm22.collect(Collectors.summingInt(Integer::intValue));
        //int total = stm22.collect(Integer::intValue).sum
        //5. 최종결과 출력하세요.
        System.out.println(sum);
        System.out.println(stm111);

    }
}

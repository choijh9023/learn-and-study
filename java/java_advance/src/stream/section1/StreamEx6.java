package stream.section1;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        //reduce() 최종연산 : 프로그래머가 직접 지정하는 연산을 적용
        List<String> names = Arrays.asList("김진성", "강호동동동", "백종우", "이도엽", "문지환");
        String name1 = names.stream().reduce("이순신",(s1,s2)-> s1.length()>=s2.length()?s1:s2);

        System.out.println(name1);
        List<Integer> numbers = Arrays.asList(10, 5, 3, 5, 6, 7, 9);
        //reduce()로 numbers의 누적합, 누족 겁 출력하는 문장 구현
       int total =  numbers.stream().reduce(0,(x,y)->x+y);
        System.out.println(numbers.stream().reduce(0,Integer::sum));
       int multi = numbers.stream().reduce(1,(x,y)->x*y);
        System.out.println("누적합 = "+total);
        System.out.println("누적곱 = "+multi);


    }
}

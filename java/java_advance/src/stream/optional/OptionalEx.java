package stream.optional;

import oop2.interface3.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        //여기서 실행하면 Exception in thread "main" java.util.NoSuchElementException: No value present 이렇게 뜬다.

        // ===========================
        //Optional은 처리방법이 3가지가 있다 이제부터 3가지를 알아보자
        // Optional 공부도 제대로 하려면 3~4시간 제대로 해야할 수 있다.
        //Optional 처리 방법 1
        OptionalDouble optionalDouble = list.stream().mapToInt(Integer::intValue).average();
        if (optionalDouble.isPresent()) {
            System.out.println("평균 :" + optionalDouble.getAsDouble());
        } else {
            System.out.println("평균 :" + 0.0);
        }

        //Optional 처리 방법 2
        double avg = list.stream()
                .mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);

        //Optional 처리 방법 3
        list.stream().mapToInt(Integer::intValue).average()
                .ifPresent(average -> System.out.println("방법 3 avg = " + average));
        //isPresent 메소드도 있넹?
    }

}

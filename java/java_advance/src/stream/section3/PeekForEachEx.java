package stream.section3;

import java.util.Arrays;

//요소 루핑 : peak() : 중간처리 메소드 , foreach() : 최종처리 메소드
public class PeekForEachEx {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        Arrays.stream(intArray).filter(number -> number % 2 == 0).peek(n -> System.out.println()); // 출력값 안나옴
        int total = Arrays.stream(intArray).filter(number -> number % 2 == 0).peek(n -> System.out.println(n)).sum();
        System.out.println(total);

    }
}

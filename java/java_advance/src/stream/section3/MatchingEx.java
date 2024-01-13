package stream.section3;
//24년 1월 11일 Match 메소드 수업 진행

import java.util.Arrays;

public class MatchingEx {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 6};
        boolean result = Arrays.stream(intArray).allMatch(number -> number % 2 == 0);
        boolean result2 = Arrays.stream(intArray).anyMatch(number -> number % 2 == 0); //
        boolean result3 = Arrays.stream(intArray).noneMatch(number -> number % 3 == 0);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}

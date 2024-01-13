package stream.section3;

import java.util.Arrays;

public class AggregateEx {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //1. 카운팅
        long a = Arrays.stream(array).count();
        System.out.println("카운팅 = "+a);
        //2. 총합
        int sum = Arrays.stream(array).sum();
        System.out.println("총합 = "+sum);
        //3. 평균
        double avg = Arrays.stream(array).average().getAsDouble();
        System.out.println("평균 = "+avg);
        //4. 최댓값
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("최댓값 = "+max);
        //5. 최소값
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("최소값 = "+min);
        //6.첫 요소 추출
        int first = Arrays.stream(array).findFirst().getAsInt();
        System.out.println("첫 요소 추출 = "+first);
    }
}

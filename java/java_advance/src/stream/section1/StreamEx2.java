package stream.section1;
//24년 1월 10일 스트림 수업
import java.util.Arrays;

public class StreamEx2 {
    public static void main(String[] args) {
        //1.정수형 배열 array 생성하고 1,2,3,4,5 로 초기화 하세요
        int[] array = {1, 2, 3, 4, 5};
        //2. 파이프라인 구성
        int sum = Arrays.stream(array).filter(n -> n % 2 == 1).sum();
        //3. 출력
        System.out.println(sum);
    }
}

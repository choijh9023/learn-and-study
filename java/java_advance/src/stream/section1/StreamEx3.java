package stream.section1;
//24년 1월 10일 스트림 수업
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        //1.정수형 배열 array 생성하고 1,2,3,4,5 로 초기화 하세요
        int[] array = {1,5,3,2,4};
        List<Integer> list = new ArrayList<>();

        for (Integer i : array) {
            if (i % 2 == 1) {
                list.add(i); // list 에  객체를 추가할때는 add를 사용한다
            }
            //1-2 오름차순으로 정리
            Collections.sort(list);
        }
        for (Integer i : list) {
            System.out.println(i);
        }

        // 스트림을 이용한 출력
        Arrays.stream(array).filter(n-> n%2 ==1).sorted().forEach(n -> System.out.print(n + "\n"));
    }
}

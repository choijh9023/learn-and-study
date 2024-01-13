package stream.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 문장 스트림을 단어 스트림으로 변환 , 문자열 숫자 목록 스트림을 숫자 스트림으로 변환하는 코드 작성
public class FlatMappingEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("안녕 하세요. 자바 백엔드 개발자 과정입니다.");
        list1.add("오늘은 목요일이며 내일까지 해야 일주일이 끝납니다.");
        list1.add("i am a best developer");
        list1.stream()
                .flatMap(data-> Arrays.stream(data.split(" "))).forEach(word -> System.out.println(word));
        list1.stream()
                .flatMap(data-> Arrays.stream(data.split(" "))).forEach(System.out::println);


    }
}

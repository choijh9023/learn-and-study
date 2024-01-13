package stream.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//24년 1월 11일
public class FilteringEx1 {
    public static void main(String[] args) {

        //1. List<Strig 컬렉션 어레이 리스트 생성 하기
        List<String> namelist = new ArrayList<>();

        //2. 같은 이름  두번 넣기
        namelist.add("백정훈");
        namelist.add("백정훈");
        namelist.add("정백훈");
        namelist.add("정가네");

        //3. 중복 요소 제거 해 주기 distinct() 메소드 사용
        namelist.stream().distinct().forEach(System.out::println);

        //4. "정" 으로 시작하는 요소만 필터링 하여 결과 출력 => API를 찾아서 해야한다
        //start.With => 시작하는 문자를 체크하는 메소드
        namelist.stream().filter(name -> name.startsWith("정")).forEach(System.out::println);

        //5. "정" 으로 시작하는 요소만 들어있는 리스트 작성 => API를 찾아서 해야한다
        List<String> junglist = namelist.stream().filter(name -> name.startsWith("정")).toList();
        System.out.println("정가네 출력=" + junglist);

        //6. 중복요소 제거하고 정으로 시작하는 요소들만 들어간 리스트로 새로운 리스트 생성
        List<String> lastlist = namelist.stream().distinct().filter(name -> name.startsWith("정")).toList();
        System.out.println("중복 제거하고 정가네 출력=" + lastlist);


    }
}

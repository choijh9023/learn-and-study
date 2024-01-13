package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEx6 {
    public static void main(String[] args) {

    /*    4.이름 리스트를 알파벳 순서로 정렬하세요

        Collection.sort(names, new Comparator<String>()){
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        }
    }

    Collection.sort(names.(a,b) ->a.compareTo(b));
}5. 문자열 리스트 names를 대문자로 변환하는 람다식을 작성하세요
*/
        List<String> names = Arrays.asList("jogn", "adam","eve","jane"); //문자열 리스트 생성
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase()) // names리스트에 있는 요소를 대문자로 바꾼것을 맵형태로 저장한다.
                .collect(Collectors.toList()); //콜랙트 메소드 사용 해서 다시 tolist로 옮겨넣는다. 굳이 다시 리스트로 옮기는 이유는 맵은 변환이 안되기때문이다.
        System.out.println(upperCaseNames);
        /*map()
        스트림 Api컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공한다.
       스트림의 요소를 다른 유형으로 변환하는데 사용 */
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumber = numbers1.stream().map(n -> n * n).collect(Collectors.toList());
        //이것이 map() 을 사용하는 예시다.
        System.out.println(squaredNumber);
        //매개변수와 반환값이 없는 람다식
     /*  ex )  x->{
            return x * x;
        }
        ex 2) (name,age)->{
            sout("Name" + name);
            sout("Age" + age);
        */
    }}

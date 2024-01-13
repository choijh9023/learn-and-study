package lambda;
//24년 1월 9일 람다식 표현법 수업
//lamda 수업
// map()은 무엇이냐
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvenNumbers = numbers.stream().filter(number -> number % 2 == 0) // 필터링하면서 짝수만  찾고
                .mapToInt(Integer::intValue) // mapToInt 를 찾아보자
                .sum(); // sum메소드는 합을 연산해주는 메소드 같다.

        System.out.println("Sum of even numbers : " + sumOfEvenNumbers);
        /*1.map()
        스트림 Api컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공한다.
       스트림의 요소를 다른 유형으로 변환하는데 사용 */
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumber = numbers1.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println(squaredNumber);

        //2.filter()
        // 조건에 따라 스트밈에서 요소를 선택하는데 사용 (조건을 정의하는 람다 표현식을 인수로 받는다)
        // 2-1 numbers1을 대상으로 홀수 리스트
        List<Integer>oddNumbers = numbers1.stream().filter(n -> n %2 ==1).collect(Collectors.toList());
        System.out.println(oddNumbers);
        // 2-2 numbers1을 대상으로 짝수 리스트
        List<Integer>evenNumbers = numbers1.stream().filter(n -> n %2 ==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //3.집계함수 : reduce() -> 정확히 뭔지 모르겠다 다시한번 봐야함
        //스트림의 요소를 단일 값으로 집계하는 사용
        //(축소 연산을 정의하는 람다 표현식을 인수로
        int total = numbers1.stream().reduce(0,(x,y)-> x+y); // identity 는 시작값이다.
        System.out.println("number1의 총합 집계 : "+total);

        //4.forEach : 스트림의 요소를 반복하고, 각 요소에 대해 작업을 수행하는데 사용 (수행 작업을 정의하는 람다 표현방식 )
        numbers1.stream().forEach(n-> System.out.println(n));

        //응용문제 스트림 API를 사용하여 리스트 numbers1의 평균을 구하는 람다식을 작성하시오
        //형변환 필요함
        double avg = numbers1.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0.0);
        System.out.println("Average : " + avg);

    }

}

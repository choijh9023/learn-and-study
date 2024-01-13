package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

interface Calculator{
    int apply(int x,int y);
}
public class LambdaTest2 {

    public interface Operator {
        public int apply(int x, int y);
    }


    public static void main(String[] args) {
        //===========================================================================================
        // 1.정수 리스트가 주어졌을때 java lamda 를 사용하여 리스트를 있는 모든 짝수의 합을 계산하시오
        //Function 인터페이스 사용해서 풀어보자

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenSum = integers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n.intValue()).sum();
        System.out.println(evenSum);
        //===========================================================================================


        //2. 두 정수를 받아 그 합을 반환하는 람다 식을 작성하세요
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        System.out.println("result =" + sum.apply(5, 2));
        //===========================================================================================

        //3. 문자열을 받아 그 길이를 반환하는 람다표현식을 작성하세요
        Supplier<String> str = String::new;
        String newString = str.get();
        newString = "나는 몇개일까요 supplier을 써봤지롱 ";
        Function<String> size = n -> n.length();
        System.out.println("3번문제 문자열의 길이 : " + size.apply(newString));
        //===========================================================================================


        //4.정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식을 작성하세요
        Integer[] integers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = Collections.singletonList(Arrays.asList(integers1).stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum());
        System.out.println("4번문제 :싱글톤리스트를 사용해서도 출력가능 = " + list);
        // 컬랙션 싱글톤리스트는 size가 1로 고정이다.
        //배열을 리스트로 형변환하면서 출력을 했다.
        int a = Arrays.stream(integers1).filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("5번문제 : 정수배열의 합은 =" + a);


        // List<Integer>evenlist = Arrays.asList(integers1).stream().filter(n -> n%2 ==0).mapToInt(Integer::intValue).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        /*List<Integer>evenlist = Arrays.asList(integers1).stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println(evenlist);*/
        //===========================================================================================


        //6.정수 리스트를 받아 모든 숫자의 곱을 반환하는 람다 표현식
        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer six = integers2.stream().reduce(1, (x, y) -> x * y); // 일단 모든 숫자를 다 곱하긴한다.
        System.out.println("6번문제 답 :" + six);
        //===========================================================================================


        //7.람다식과 스트림 API를 사용하여 정수리스트의 평균을 구하는 프로그램 작성
       /* System.out.println("7번문제 => 정수 리스트 평균 구하기 " + integers2.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0));*/
         Integer seven = (int) integers2.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0); //
        System.out.println("7번문제 답 :" + seven);
        //===========================================================================================


        //8.두개의 정수를  매개변수로 받아 그 합계를 반환하는 계산이라는 매서드가 있는
        //MathOperation 이라는 함수형인터페이스만들기
        BiFunction<Integer,Integer,Integer> MathOperation = (x,y) -> x+y;
        System.out.println("8번문제 답 "+MathOperation.apply(5,2));
        //===========================================================================================


        //9.정수를 반환하는 매서드가 있는 함수형 인터페이스를 만들고
        // 두 숫자를 더하고 그 합을 반환하는 함수형 인터페이스를 구현하는 람다 표현식을 만들것
        BiFunction<Integer,Integer,Integer> Calculator = LambdaTest2::calculate; // 참조형 매소드로 이렇게 쓸 수 있다.
        System.out.println("9번의 첫번째 풀이정답은 ="+ Calculator.apply(5,2));
        Calculator calculator = Integer::sum;// 이렇게 풀 수도 있다.대신 이렇게 풀거면 함수형 인터페이스를 하나 만들어 줘야한다.
        System.out.println("9번의 두번째 풀이정답은 ="+calculator.apply(6,1));

        //===========================================================================================


        //10.필터,매핑,축소연산을 사용하여 정수리스트에 모든 짝수의 총합을 구할것
        int eventotal = integers2.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).reduce(0,(x,y)->x+y);
        System.out.println("10번 답은 ="+eventotal); // 축소연산이 뭐징

        //1. 4
        //2. 4
        //3. 2
        //4.
        BiFunction<Double, Double, Double> Operator = (x, y) -> x / y;
        System.out.println("result : " + Operator.apply(5.0, 3.0));


        //5.

        int max = maxOrMin((x, y) -> (x > y) ? x : y);
        System.out.println(max);
        int min = maxOrMin((x, y) -> (x < y) ? x : y);
        System.out.println(min);


    }public static int calculate(int a, int b){
        int result = a+b;

    return result;}

    public static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }
}

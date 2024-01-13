package lambda;

import java.util.Arrays;
import java.util.List;

interface Stringlength {
    int getlength(String a);
}


public class LambdaEx3 {
    public static void main(String[] args) {
        //문자열의 길이를 반환하는 람다식 작성

        //람다식에 데이터를 잔달한 후 반한 처리 구문 작성

        Stringlength stringlength =  a -> a.length();
        int result = stringlength.getlength("fwef");
       // System.out.println(result);

        //1. 정수형 리스트를 numbers 를 생성하세요 리스트의 순서는 1,2,3,4,5 입니다.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //2. numbers의 값을 순서대로 출력하는 람다식을 작성하세요.
        numbers.forEach( number -> System.out.println( number));
        numbers.forEach((number) ->{System.out.println(number);});



    }
}

package lambda;
// 2정수의 합을 반환하는 것을 람다식으로 표현하기
//함수형 메서드인터페이스사용해서 해볼것

interface MathOperation{ // 인터페이스 메서드
    int calculate(int a, int b);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b; // * % /  모두 다 가능하다
        int result = addition.calculate(5,3);
        System.out.println("Result : " + result);
    }
}

package Ex;

public class Add {
    //공통필드를 선언해야함
    private Object a; //오브젝트 클래스는 다 담을 수 있다.
    private Object b; //오브젝트 클래슨
    private double c; //변수명 같은거 못씀
    private double d;

    public Add() {
    }

    ; // 디폴트 생성자 선언

    public void numObj1(int a, int b) { //메소드1
        this.a = (Integer) a; //-> 기본타입을 클래스 타입으로 변경 (인티저는 클래스타입이다.)
        this.b = (Integer) b; //-> 기본타입을 클래스 타입으로 변경 (인티저는 클래스타입이다.)
        adder(a, b);


    }

    public void numObj2(double a, double b) { //메소드2
        this.c = (Double) a;
        this.d = (Double) b;
        adder2(a, b);
    }

    public void numObj3(int a, double b) {  //메소드3
        this.a = (Integer) a;
        this.b = (Double) b;
        adder3(a, b);
    }

    //연산 자체를 생성자에서 하는건 좋지 않다. 그래서 연산하는
    public void adder(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public void adder2(double a, double b) {
        double result = a + b;
        System.out.println(result);
    }

    public void adder3(int a, double b) {
        double result = a + b;
        System.out.println(result);

    }
}
package oop.Interface_3;

public class Interface3Main {
    public static void main(String[] args) {
        //구현객체 생성
        B b = new B();
        C c = new C();
       // B bc = new C();
        System.out.println("=============");

        D d = new D();
        E e = new E();
        System.out.println("=============");
        //인터페이스 변수 선언
        A a;

        System.out.println("=============");
        //변수에 구현 객체 대입
        a = b;    //A  <=== B  (promotion)
        B b1 = (B)a;    // A  ===> B (casting)
        a = c;    //A  <=== C
        //        C c1 = (C)a;
        a = d;   //A  <=== D
        D d1 = (D)a;
        a = e;   //A  <=== E
        E e1 =(E) a;





    }
}

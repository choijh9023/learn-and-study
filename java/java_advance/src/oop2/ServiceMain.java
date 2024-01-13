package oop2;

public class ServiceMain {
    public static void main(String[] args) {
        Service service = new ServideImpl();    //인터페이스 변수 선언하고 구현객체 대입 => 인잭션이라고부른다

        service.defaultMethod1();
        System.out.println();

        service.defaultMethod2();
        System.out.println();

        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();

    }
}

package oop2.interface2;

public class InterfaceMain {
    public static void main(String[] args) {//인터페이스끼리 상속이 가능하다
        interfaceImpl impl = new interfaceImpl();


        InterfaceA interfaceA = impl; // 객체 생성

        InterfaceB interfaceB = impl; // 객체 생성
        InterfaceC interfaceC = impl; // 객체 생성

        interfaceA.methodA(); // 메소드 호출

        interfaceB.methodB();   // 메소드 호출

        interfaceC.methodc();   // 메소드 호출
    }
}

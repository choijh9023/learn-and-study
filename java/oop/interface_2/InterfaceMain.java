package oop.interface_2;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        System.out.println(impl.toString());

        InterfaceA interfaceA = impl;

        InterfaceB interfaceB = impl;
        InterfaceC interfaceC = impl;

        interfaceA.methodA();

        interfaceB.methodB();

        interfaceC.methodB();
        interfaceC.methodA();
        interfaceC.methodC();


    }
}

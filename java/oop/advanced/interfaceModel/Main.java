package oop.advanced.interfaceModel;

public class Main {

    public static void main(String[] args) {
        //Television television1 = new Television();
        //television1.turnOn();
        RemoteControl rc1;
        //RemoteControl rc2;
        rc1 = new Television();
        rc1.turnOn();
        rc1.turnOff();
        rc1 = new Audio();


        rc1.turnOn();
        rc1.turnOff();
    }
}

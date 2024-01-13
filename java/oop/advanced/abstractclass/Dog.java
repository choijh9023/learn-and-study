package oop.advanced.abstractclass;

public class Dog extends AbstarctDog{
    @Override
    public void printSound() {
        System.out.println("멍멍");
    }

    @Override
    public void tailing() {
        System.out.println("살랑살랑");
    }
}

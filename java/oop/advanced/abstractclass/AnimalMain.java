package oop.advanced.abstractclass;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printSound();
        Cat cat = new Cat();
        cat.printSound();
        Animal d = new Dog();
        Animal c = new Cat();

    }
}

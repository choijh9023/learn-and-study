package oop.advanced.abstractclass.Vehicle;

public class Example3 {
    public static void main(String[] args) {
        Bike MyBike = new Bike();
        Car Mycar = new Car();
        MyBike.printType();
        MyBike.printPrice();
        MyBike.printBrand();
        Mycar.printType();
        Mycar.printPrice();
        Mycar.printBrand();

    }
}

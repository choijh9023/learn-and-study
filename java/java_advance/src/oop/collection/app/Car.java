package oop.collection.app;

public class Car implements Comparable<Car> {

    private String car;
    private int price;

    public Car(String car, int price) {
        this.car = car;
        this.price = price;
    }
    @Override
    public int compareTo(Car o) {
        int comparePrice = o.getPrice();
        return this.price -comparePrice;

    }

    public String getCar() {
        return car;
    }

    public int getPrice() {
        return price;
    }
}

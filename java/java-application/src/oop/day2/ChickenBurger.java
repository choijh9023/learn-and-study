package oop.day2;

public class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Packing packing() {
        return null;
    }

    @Override
    public float price() {
        return 10.5f;
    }
}

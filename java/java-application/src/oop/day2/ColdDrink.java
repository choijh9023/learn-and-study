package oop.day2;

public abstract class ColdDrink implements Item {

    public Packing packing(){
        return new Bottle();
    }
    public abstract float price(); //추상화 하는 이유 --> 구현하지 않으면 오류가 나니까

}

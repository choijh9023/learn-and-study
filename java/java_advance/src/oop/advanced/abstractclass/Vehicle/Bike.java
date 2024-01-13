package oop.advanced.abstractclass.Vehicle;

public class Bike extends Twowheeler{ //추상클래스가 아니고 자식클래스다


    @Override
    public void printType() {
        System.out.println("이것은 자전거입니다.");
    }

    @Override
    public void printPrice() {
        System.out.println("가격 : 150,000");
    }

    public void printBrand(){

        System.out.println("브랜드 : 삼천리");
    }
}

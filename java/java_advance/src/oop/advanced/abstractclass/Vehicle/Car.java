package oop.advanced.abstractclass.Vehicle;

public class Car extends FourWheeler {
    @Override
    public void printPrice() {
        System.out.println("가격 : 50,000,000");

    }

    @Override
    public void printType() {
        System.out.println("브랜드 : BMW");
    }

    public void printBrand(){
        System.out.println("이것은 자동차입니다.");


    }

}

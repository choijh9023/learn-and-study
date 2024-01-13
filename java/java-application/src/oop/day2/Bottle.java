package oop.day2;

public class Bottle implements Packing{
    @Override // 이것도 패킹을 상속받아서
     public String pack() {
        return "Bottle";
    }
}

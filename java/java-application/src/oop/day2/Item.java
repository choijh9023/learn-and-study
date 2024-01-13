package oop.day2;

public interface Item {
    //인터페이스라는 타입은 기능정의(메소드정의) 를 할때  바디를 가질 수 없고 정의만 한다 --> abstract method(추상메소드)
    // 단순 추상화과정 (객체지향의 추상화 과정)
    public String name();
    public Packing packing();
    public float price();
}

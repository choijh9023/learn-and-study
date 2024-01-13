package oop.day2;

public class Wrapper implements Packing {

    @Override // 바디 생성 -> 바디가 만들어 졌다. 정의만 만들어졌던게 실체화 된것이다. 인스턴스화
    public String pack() {
        return  "Wrapper";
    }
}

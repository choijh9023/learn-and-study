package oop.day2;

import java.util.ArrayList;
import java.util.List; //>> List 는 인터페이스다. 담을 타입을 지정할 수 있고 타입도 만들 수 있다.

// 자바 컬렉션 프레임워크와 연관이 있다.API보고 공부할것
public class Meal {
    // - ( private 접근 제한자로 설정)
    // 순서가 있는 클래스 >> ArrayList
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item); //-->  키오스스에서 + 버튼을 눌러서 장바구니에 담는 행위와 같은 기능
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price(); // 이 부분 잘 모르겠다 ========================================================
        }
        return cost;
    }

    public void showitems() { // 출력 부분
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.print(", Price : " + item.price());
        }
    }
}
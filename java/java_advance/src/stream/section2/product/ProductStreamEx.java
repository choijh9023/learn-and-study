package stream.section2.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProductStreamEx {
    public static void main(String[] args) {
        //1. 외부 반복자 fori 를 이용하여 product를 생성할때 제품번호=> i ,
        // "상품명" => + i, "shinsaegae", 가격 random()메소드로 책정(가격은 1만원으로 제한)
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            productList.add(new Product(i,"상품명" +i,"shinsaegae",(int)(Math.random()*10000)));
        }
        // 랜덤메소드는 랜덤 클래스로 이렇게 작성할 수도 있다. (정훈이꺼)
        for (int i = 0; i < 10; i++) {
            productList.add(new Product(i,"상품명" +i,"shinsaegae",new Random().nextInt(1,10000)));
        }

        //2. 객체 스트림을 통하여

        productList.stream().forEach(System.out::println);
        productList.stream().forEach(product -> System.out.println(product.toString()));



    }
}

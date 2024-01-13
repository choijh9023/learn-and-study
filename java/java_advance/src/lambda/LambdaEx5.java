package lambda;


import java.util.List;

public class LambdaEx5 {
    interface Product {
        int calculate(List<Integer> list);

    }
    public static void main(String[] args) {
        Product product = products -> products.stream().reduce(1,(a, b)-> a*b);
        List<Integer> list = List.of(2, 3, 4);
        System.out.println(product.calculate(list));

    }
}

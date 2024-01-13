package lambda.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {
    public static void main(String[] args) {
    List<Product> products = Arrays.asList(new Product("Laptop",150000.0),
            new Product("Phone", 600000.0),
        new Product("Mouse",3000.0),
        new Product("Tablet", 50000.0));


        System.out.println("===============Product 리스트===============");
        products.forEach(System.out::println);
        System.out.println("===============가격별 정리된 Product 리스트===============");
        List<Product> sortedProducts = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
        sortedProducts.forEach(System.out::println);
    }
}

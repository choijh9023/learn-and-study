package lambda.Product;

public class Product { //상품 클래스
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "[name]=" + name + '\'' +
                ", [price]=" + price +
                '}';
    }

}

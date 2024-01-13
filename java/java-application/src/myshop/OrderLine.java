package myshop;
/*
주문 항목 표현 클래스 : 주문할 상품, 상품의 가격, 구매 개수 , 각 구매 항목의 구매 가격 제공
한 상품(Product)을 얼마에 (price)을 몇개 살지(quantity) 담고, CalcuateAmounts() 구매 가격 계산 로직 구현  어려운거 아니다 보면 된다.

 */
public class OrderLine {
    private Product product;
    private ShippingInfo shippingInfo;
    private int price;
    private int quantity; //몇개를 살지에 대한 양
    private int amounts;
    public OrderLine(Product product, int price, int quantity){
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.amounts = this.calculateAmounts();
    }


    private int calculateAmounts(){
        return this.price*quantity;
    }
}

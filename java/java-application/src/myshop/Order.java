package myshop;

import java.util.List;

public class Order {
    /*    - 출고 상태로 변경하기
- 배송지 정보 변경하기
- 회원주문 취소하기
- 주문 완료하기
- 총 주문 금액 도출하기
- 출고 전 후로 상품 상태 변경 불가*/
    private ShippingInfo ShippingInfo;
   private List<OrderLine> orderLines;
   private  Money totalAmonts;  //머니를 클래스로 저장한 하려고 하는 이유는 따로 저장하려고 클래스는 데이터를 저장하기때문
    private OrderState state;

    public Order(List<OrderLine>orderLines,ShippingInfo shippingInfo){
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        if(shippingInfo==null) throw new IllegalArgumentException("no ShippingInfo");

    }

    private void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLestOneorMoreOrderLines(orderLines);
        this.orderLines = orderLines;

    }

    private void   verifyAtLestOneorMoreOrderLines(List<OrderLine> orderLines){
        if(orderLines== null || orderLines.isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }

    }

    public void changeShipped(ShippingInfo shippingInfo){
        //배송확인하는 메소드가 필요
        verifyNotYetShipped();
    };
    public void verifyNotYetShipped(){
        if(state!= OrderState.PAYMENT_WAITNG && state != OrderState.PREPARING ){
            throw new IllegalArgumentException("already shipped");
        }
    };
public void changeShippingInfo(ShippingInfo newShipping){}
public void cancel(){
    verifyNotYetShipped();
    this.state = OrderState.CANCELED;
};
public void completePayment(){};





}

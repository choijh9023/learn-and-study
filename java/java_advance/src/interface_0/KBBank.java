package interface_0;

public class KBBank implements Bank{
    @Override
    public void withDraw(int price) {//추상메소드(인출하는 메소드)
        if(price>0){
        System.out.println("KB은행만의 인출 로직 ..." +price+ "원을 인출한다.");}
    }

    @Override
    public void deposit(int price) {//추상메소드(입금하는 메소드)
        if(price>0){
        System.out.println("KB은행만의 입금 로직 ..." +price+ "원을 입금한다.");
    }}

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}

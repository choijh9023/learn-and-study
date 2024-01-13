package interface_0;

public class KakaoBank implements Bank{
    @Override
    public void withDraw(int price) {
        System.out.print("SH은행만의 인출 로직...");
        System.out.println(price + "인출한다.");

    }

    @Override
    public void deposit(int price) {
        System.out.printf("SH은행만의 입급 로직...%d 원을 입급한다.\n",+price);
        System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");



    }

    @Override
    public String findDormancyAccount(String custId) {
        custId = "SH은행";
        return custId;
    }
}

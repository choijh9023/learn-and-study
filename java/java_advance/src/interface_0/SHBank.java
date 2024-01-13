package interface_0;

public class SHBank implements Bank{
    @Override
    public void withDraw(int price) {

    }

    @Override
    public void deposit(int price) {

    }

    @Override
    public String findDormancyAccount(String custId) {
        return Bank.super.findDormancyAccount(custId);
    }
}

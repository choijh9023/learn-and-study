package interface_test01;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스운전중입니다.");
    }

    public void chechFare(){
        System.out.println("승차요금을 확인해 주세요!");
    }
}

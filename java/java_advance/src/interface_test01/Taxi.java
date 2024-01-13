package interface_test01;

public class Taxi implements Vehicle{

    @Override
    public void run() {
        System.out.println("택시운전중입니다.");
    }
}

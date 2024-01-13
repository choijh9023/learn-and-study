package interface_test01;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();




        driver.drive(bus); // 자동 타입 변환 (promotion) ==> 오버라이딩 메소드호출 --> 다형성
        driver.drive(taxi);//   자동 타입 변환 (promotion) ==> 오버라이딩 메소드호출 --> 다형성
        ride(taxi);
        ride(bus);
    }

    //인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus bus) bus.chechFare(); // instanceof는 무엇이냐아아아아아
    }
}

package oop.interface_4;

import oop.Interface_3.D;

public class DriveMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);   //자동타입변환(promotion) -->오버라이딩 메소드 호출-->다형성
        driver.drive(taxi);  //자동타입변환(promotion) -->오버라이딩 메소드 호출-->다형성
        ride(taxi);
        ride(bus);

    }

    //인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        if(vehicle instanceof Bus bus) bus.checkFare();   // 자바12버전 부터
        vehicle.run();

    }

}

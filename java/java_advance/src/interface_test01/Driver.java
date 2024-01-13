package interface_test01;

public class Driver {
    void drive(Vehicle v){ // 구현 객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언
        v.run();    //매개변수는 그냥 변수 == 파라미터 라고생각하면된다.
    }
}

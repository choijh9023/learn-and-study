package interfaceModel;

public class Television implements RemoteControl{ // implements < 인터페이스 구현하는 메소드

    @Override
    public void tunr() {
        System.out.println("TV채널 변경");

    }

    @Override
    public void turnOn() {
        System.out.println("TV전원 On");
    }

    @Override
    public void tunrOff() {
        System.out.println("TV전원 Off");
    }
}

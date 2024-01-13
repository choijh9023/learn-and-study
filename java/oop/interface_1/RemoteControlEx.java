package oop.interface_1;

public class RemoteControlEx {

    public static void main(String[] args) {
        //1. 상수는 구현객체와 상관없는 인터페이스 멤버이므로 바로 접근해서 상수값을 읽을 수 있다.
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
        System.out.println(Math.PI);

        //2. SAMSUNG TV객체를 생성하여 다음과 같은 동작을 차례로 수행시키세요
/*1. 전원을 켠다.
2. 해당 TV의 기본 MAX, MIN 볼륨값을 확인한다.
3. TV의 볼륨을 20을 셋팅하고 값을 확인한다.
4. 전원을 끈다.*/

        RemoteControl remoteControl;

        //RemoteControl SAMSUNGTV = new TV();
        remoteControl = new TV();   //TV객체를 생성하여 인터페이스타입 remoteControl 변수에 주입(Injection)
        /*SAMSUNGTV.turnOn();
        System.out.println(SAMSUNGTV.MAX_VOLUME  + SAMSUNGTV.MIN_VOLUME);
        System.out.println(RemoteControl.MAX_VOLUME  + RemoteControl.MIN_VOLUME);
        SAMSUNGTV.setVolume(20);
        SAMSUNGTV.turnOff();*/
        remoteControl.turnOn();
        System.out.println(remoteControl.MAX_VOLUME  + remoteControl.MIN_VOLUME);
        //System.out.println(RemoteControl.MAX_VOLUME  + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        //remoteControl.turnOff();

        //remoteControl = new Radio();
        /*remoteControl.turnOn();
        System.out.println(remoteControl.MAX_VOLUME  + remoteControl.MIN_VOLUME);
        System.out.println(RemoteControl.MAX_VOLUME  + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        remoteControl.turnOff();*/

        remoteControl.setMute(true);    //default method를 사용
        remoteControl.setMute(false);
        RemoteControl.changeBattery();
    }
}
//LGRadio 객체를 생성하여 다음과 같은 동작을 차례로 수행시키세요
/*1. 전원을 켠다.
2. 해당 Radio의 기본 MAX, MIN 볼륨값을 확인한다.
3. Radio의 볼륨을 20을 셋팅하고 값을 확인한다.
4. 전원을 끈다.*/
package oop2;

public class RemoteControlEx {
    /*1. 전원을 켠다.
    2. 해당 TV의 기본 MAX, MIN 볼륨값을 확인한다.
    3. TV의 볼륨을 20을 셋팅하고 값을 확인한다.
    4. 전원을 끊다.*/
    public static void main(String[] args) {
        //상수는 구현객체와 상관이 없다. 직접 접근이 가능하다
        //고로 인터페이스는 직접 접근이 가능하다.
        RemoteControl remoteControl;
        remoteControl = new TV(); //TV객체를 생성하여 인터페이스 타입 변수에 주입 (Injection)

        remoteControl.tunrOn();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        remoteControl.turnOff();

        System.out.println("=======================================================================================");
      //  remoteControl = new Radio();
        remoteControl.tunrOn();
        System.out.println(RemoteControl.MAX_VOLUME + RemoteControl.MIN_VOLUME);
        remoteControl.setVolume(20);
        remoteControl.turnOff();
        remoteControl.setMute(true);    //default method 를 사용
        remoteControl.setMute(false);   //
        RemoteControl.chargeBatery(); // 객체를 통하는 것이 아닌 직접 호출이 가능하다.

        //LG Radio 객체 생성하고 다음과 같은 동작 수행
        //1. 전원을 킨다.
       /* 2. 해당 TV의 기본 MAX, MIN 볼륨값을 확인한다.
        3. TV의 볼륨을 20을 셋팅하고 값을 확인한다.
        4. 전원을 끊다.*/

    }
    }

package oop.interface_1;
//RemoteControl 인터페이스를 기준으로 해당 TV클래스를 구현 하세요


public class Radio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {  //추상메소드 재정의 (오버라이딩 : overriding)
        System.out.println("Radio Power On");
            }

    @Override
    public void turnOff() {  //추상메소드 재정의 (오버라이딩 : overriding)
        System.out.println("Radio Power Off");
    }

    @Override
    public void setVolume(int volume) {   //추상메소드 재정의 (오버라이딩 : overriding)
        //인터페이스 상수 MAX_VOLUME 과 LOW_VOLUME 사용하여
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME - 15;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨 :" + this.volume);
    }
}
//RemoteControl 인터페이스를 기준으로 해당 Radio클래스를 구현 하세요
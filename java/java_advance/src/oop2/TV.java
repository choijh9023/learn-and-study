package oop2;
//RemoteControl 인터페이스를 기준으로 해당 TV객체를 생성하세요.
//SAMSUNG TV 객체를 생성하여 다음과 같은 동작을 차례로 수행시키세요.
/*1. 전원을 켠다.
2. 해당 TV의 기본 MAX, MIN 볼륨값을 확인한다.
3. TV의 볼륨을 20을 셋팅하고 값을 확인한다.
4. 전원을 끊다.*/
public class TV implements RemoteControl{ //인터페이스를 상속할땐 implements
    private int volume;
    private int memoryvolume;


    @Override
    public void tunrOn() {      // 추상메소드를 오버라이딩 한것이다( 재정의 한것이다) overriding
        System.out.println("Power On");
    }

    @Override
    public void turnOff() {
        System.out.println("Power Off"); // 추상메소드를 오버라이딩 한것이다( 재정의 한것이다) overriding

    }

    @Override
    public void setVolume(int volume) {
        //인터페이스 상수 MAX_VOLUME 과 LOW_VOLUME 사용하여
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME - 15;
        }else if (volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 볼륨 :" + this.volume);

    }

    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryvolume=this.volume;
            System.out.println("Mute Processing ");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("Mute Cancel");
            this.volume=this.memoryvolume;
        }
    }
}
//Radio 클래스를 구현하시오
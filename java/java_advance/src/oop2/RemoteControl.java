package oop2;

public interface RemoteControl {
    //1. 상수필드
     int MAX_VOLUME =30;     // 상수 : public static final  인터페이스는 자동으로 퍼블릭 스테틱 파이널이 붙는다 .(자동컴파일이 된다)
     int MIN_VOLUME = 0;     // 상수는 대문자로 만들어주는것이 원칙이다. 언더바를 넣어주는것이 국룰이다.

    //2.추상메소드 abstract , {} 바디가 없는 메소드 (메소드 선언부만 작성)

    void tunrOn(); //전원 켬

    void turnOff(); // 전원 끔

    void setVolume(int volume);  //볼륨 셋팅


    //3. 디폴트 인스턴스 메소드 (default method) 인터페이스에서 완전한 실행코드를 가진 유일한 메소드
    default void setMute(boolean mute){

        if(mute){
            System.out.println("Mute Processing ");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("Mute Cancel");

        }
    }
    static void chargeBatery(){ // 자동 컴파일 된다. 퍼블릭으로 인터페이스에서 구현한 스태틱 메소드는 객체의 유무상관없이 바로 사용이 가능하다.
        System.out.println("리모컨 건전지를 교환합니다.");
    }

}


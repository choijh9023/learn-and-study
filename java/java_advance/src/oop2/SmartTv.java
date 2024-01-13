package oop2;

public class SmartTv implements RemoteControl,Searchable{ //다중상속
    private int volume;
    private int channel;
    @Override
    public void tunrOn() {
        System.out.println("SmartTv 전원On");

    }

    @Override
    public void turnOff() {
        System.out.println("SmartTv 전원Off");
    }

    @Override
    public void setVolume(int volume) { // 여기 슈퍼를 쓸수가 없다 why? 슈퍼는 객체가 있어야 한다.
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
        RemoteControl.super.setMute(mute);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "검색합니다");
    }

    @Override
    public void channelUp(int channel) {
         this.channel++;
    }

    @Override
    public void channelDown(int channel) {
        this.channel--;
    }
}

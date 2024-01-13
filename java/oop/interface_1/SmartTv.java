package oop.interface_1;

public class SmartTv implements  RemoteControl,Searchable{
    private  int volume;
    private int channel;
    @Override
    public void turnOn() {
        System.out.println("SmarTV 전원On");
    }

    @Override
    public void turnOff() {
       System.out.println("SmarTV 전원Off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME - 15;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
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
        System.out.println(url +"검색합니다.");
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

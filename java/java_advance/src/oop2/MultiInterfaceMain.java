package oop2;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        Searchable searchable;
        remoteControl = new SmartTv();
        remoteControl.tunrOn();
        remoteControl.turnOff();
        remoteControl.setVolume(20);
        remoteControl.setMute(true);

        searchable = new SmartTv();
        searchable.search("http://naver.com");
    }
}

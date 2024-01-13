package interfaceModel;

public class Audio implements RemoteControl{

    public Audio(){}
    int num;
    @Override
    public void tunr() {
        System.out.println("TV채널변경");
    }

    @Override
    public void turnOn() {
        System.out.println("Audio 전원 on ");
    }

    @Override
   public void tunrOff() {
        System.out.println("Audio 전원 off");
    }
}

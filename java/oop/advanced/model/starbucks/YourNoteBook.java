package oop.advanced.model.starbucks;

public class YourNoteBook {
    private Wifi internet;

    public YourNoteBook(Wifi wifi) {
        this.internet = wifi;
    }

    void openKakaTalk() {
        //this.internet 인터넷을 이용하여 카카오톡을 동작시킨다.
        this.internet.connectionInternet();
    }

}

package oop.advanced.model.starbucks;

public class MyNoteBook {
         private Wifi internet;

         public MyNoteBook(){
             //this.internet = wifi;
             this.internet = new Wifi();
         }

         void  openBrowser(){
             //this.internet 인터넷을 이용하여 브라우저를 동작한다.
             this.internet.connectionInternet();
         }


}

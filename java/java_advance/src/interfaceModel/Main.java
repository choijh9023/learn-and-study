package interfaceModel;

import Shape_Class.Rectangle;

public class Main {
    public static void main(String[] args) {
      /*  Television television1 = new Television();
        television1.turnOn();
        television1.tunrOff();
        */
        RemoteControl rc1;
       // RemoteControl rc2;
        rc1 = new Television();
        rc1.turnOn();
        rc1.tunrOff();
        rc1 = new Audio();
        rc1.turnOn();
        rc1.tunrOff();
        rc1.tunr();





    }
}

package oop.day2.ClassEx.sec03.exam01;

public class Car {
	//필드(맴버),변수 선언

    String modelname;  //순서
    boolean start;
    int speed;
    Car(){} //디폴트

    Car(String modelname,boolean start,int speed){ //순서 맞아야됨
        this.modelname = modelname;
        this.start = start;
        this.speed = speed;
    }

}
package oop.day2.ClassEx.sec05.exam01;

public class Calculator {
	//리턴값이 없는 메소드 선언
    boolean power = false;


    public Calculator(){}

    public Calculator(boolean power){
        this.power = power;
        if(this.power==true){powerOn();}
    }
    public void powerOn(){

        this.power = true;
        System.out.println("전원이 켭니다");
    }
	//리턴값이 없는 메소드 선언


    public void powerOff(){
    this.power =false;
        System.out.println("전원을 끕니다.");
    }

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int plus(int a, int b){
        return (a+b);
    }

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    public double divide(int x, int y){
        return((double)x/y);
    }
}
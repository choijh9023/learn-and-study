package oop.day2.ClassEx.sec06;
////가변길이 매개변수
////메소드를 호출할 때, 매개변수의 개수에 맞게 제공해야 한다.
////만약, 메소드가 가변길이 매개변수를 가지고 있다면 , 매개변수의 개수와 상관없이 매개값을 제공해야 한다.
//int sum(int.......values)
public class Computer {
    boolean isPower = false;
    int sum(int ...values){
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum+= values[i];

        }
        return sum;

        //System.out.println(sum);


    } //return 문 : 메소드의 실행을 강제 종료,  호출한 곳으로 돌아간다.
    boolean isPower(){
        if(isPower==true){
            System.out.println("컴퓨터 전원이 켜져있습니다.");
            return true;
        }
        System.out.println("전원이 꺼져 있습니다.");
        return false;
    }


}

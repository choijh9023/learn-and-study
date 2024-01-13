package Interface_test;

public abstract class Animal {
    protected int speed;
    protected double distance;

   Animal(int speed){ // 이걸 꼭 해줘야 한다 . () 이곳은 입력할 공간 {} 이 안에 입력받은 것을 넣을 공간을 넣어줘야한다.
       this.speed = speed;
   }
    abstract void run (int hours);

    public double getDistance(){

    return distance;}
}

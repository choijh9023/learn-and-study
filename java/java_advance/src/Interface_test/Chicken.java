package Interface_test;

public class Chicken extends Animal implements Cheatable {


    Chicken(int speed) {
        super(speed);
    }

    @Override
    public void fly() {
        speed *= 2;
    }

    @Override
    void run(int hours) {
        distance = speed * hours;

    }


}


package Interface_test;

public class Dog extends Animal {


    Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {

        distance = speed * ((double) hours / 2);
    }


}

package Interface_test;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(8);
        Chicken Chicken = new Chicken(3);
        Chicken cheatable = new Chicken(5);



        if(Chicken instanceof Cheatable){
            cheatable.fly();
        }
        for (int i = 1; i < 4; i++) {
            dog.run(i);
            Chicken.run(i);

            (cheatable).run(i);
            System.out.println("개의 이동거리 " + dog.getDistance());
            System.out.println("닭의 이동거리" + Chicken.getDistance());
            System.out.println("날으는 닭의 이동거리"+(cheatable).getDistance());





        }


    }
}

package oop.day4.inher;

public class CatMain {
    public static void main(String[] args) {
        BabyCat babyCat = new BabyCat("brown");

        babyCat.printInfo();
        babyCat.getBread();
        babyCat.eat();
        babyCat.meow();
        Object obj1 = babyCat; //베이비 캣이라는 클래스가 오브젝트타입으로 바뀌었다.
                                //모든 파일은 보낼때는 오브젝트파일로 직렬화 해서 보내지고 보내서 열떄는 역직렬화되어서 열린다.
                                //아래처럼
        BabyCat baby = (BabyCat)obj1;

        baby.getBread();

    }
}

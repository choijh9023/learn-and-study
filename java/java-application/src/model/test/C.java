package model.test;

public class C {

    public static void main(String[] args) {
        A s1 , s2;
        B x1, x2;

        s1 = new A();
        s2 = new A();

        x1 = new B();
        x2 = new B();


        s1.a1();
        s1.a2();
        x1.b1();
        String data = s1.a3();
        x1.b3(data);
        // B타입의 x1 객체에 b4()메소드 : 리턴타입으로 작성하세요.
        //(요구조건) A타입의 a3()메소드에서 제공한 값을 받아서
        //" B타입의 x1객체에서 처리하였습니다."
        String a3 = s1.a3(); //A클래스의 data
        String b4 = x1.b4(a3);
        System.out.println(b4);


    }
}
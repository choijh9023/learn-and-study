package oop.day2.hamberger;
//JavaBean 패턴 : Setter 메소드를 사용한 패턴(매개변수가 없는 생성자를 만든 후, Setter 메소드를 이용하여 클래스 필드를 초기화)
public class HamburgerBean {
    //필수


    //선택
    private int patty;

    private int bun;
    private int cheese;

    private int tomato;

    private int bacon;

    public HamburgerBean() {
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }
}

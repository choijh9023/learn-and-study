package oop.day2.hamberger;

public class Hamburger {
    //필수


    //선택
    private int patty;

    private int bun;
    private int cheese;

    private int tomato;

    private int bacon;

    public Hamburger() {
    }

    public Hamburger(int bun, int patty, int cheese, int tomato, int bacon) { //오버로딩 작업이라고한다.
        this.bun = bun;
        this.patty = patty;
        this.tomato = tomato;
        this.cheese = cheese;
        this.bacon = bacon;


    }

    public Hamburger(int bun, int patty, int cheese) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
    }

    public Hamburger(int bun, int patty, int cheese, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;


    }
}
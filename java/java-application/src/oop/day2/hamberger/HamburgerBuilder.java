package oop.day2.hamberger;

import oop.person;

public class HamburgerBuilder {
    //필수


    private final int patty;

    private final int bun;

    //선택
    private int cheese;


    public static class Builder {
        private final int patty;

        private final int bun;
        private int cheese;


        public Builder(int patty, int bun) {
            this.patty = patty;
            this.bun = bun;

        }

        public Builder cheese(int val) {
            cheese = val;
            return this;
        }

        public HamburgerBuilder build() {
            return new HamburgerBuilder(this);
        }
    }
        private HamburgerBuilder(Builder builder) {
            patty = builder.patty;
            bun = builder.bun;
            cheese = builder.cheese;
        }
}
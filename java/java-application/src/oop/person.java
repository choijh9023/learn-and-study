package oop;

public class person {
    private final String name; //매게
    private final String address; //선택
    private final int tel; //선택
    private final int age; //선택


    public static class Builder {
        private final String name; //매게
        private String address = ""; //선택
        private int tel = 0; //선택
        private int age =0; //선택

        public Builder (String name) {
            this.name = name;

        }
        public Builder address(String val) {
            address = val;
            return this;
        }
        public Builder age(int val) {
            age = val;
            return this;

        }
        public Builder tel(int val) {
            tel = val;
            return this;
        }

        public person build() {
            return new person(this);
        }
    }
    private person(Builder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.tel = builder.tel;
    }

}
package oop.day3.modifirepublicex;

public class AccessModifier01 {
    public static void main(String[] args) {
        dog dogObj1 = new dog();
        dogObj1.breed = "포메";
        dogObj1.color = "흰색"; //패키지 명도 하나의 경로다.
        System.out.println(dogObj1.breed + " " + dogObj1.color);


    }

}
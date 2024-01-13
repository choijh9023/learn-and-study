package oop.day2;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder MrealBuilder = new MealBuilder(); //주문대에 섰다.


        Meal vegMel = MrealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMel.showitems();
        System.out.println("Total Cost : " + vegMel.getCost());

        Meal nonVegMeal = MrealBuilder.prepareNonVegMeal();
        System.out.println("NonVeg Meal");
        vegMel.showitems();
        System.out.println("Total Cost : " + nonVegMeal.getCost());
    }
}

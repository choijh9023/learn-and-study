package oop.day2;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBerger());
        meal.addItem((Item) new Coke());
        return meal;
    }


    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem((Item) new Pepsi());
        return meal;
    }
}
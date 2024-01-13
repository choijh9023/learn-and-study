package Shape_Class;

public class Example {
    public static void main(String[] args) {
       Circle circle = new Circle("Red", 3.5);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle("blue",4.5,5.2);
        System.out.println(rectangle.toString());

    }
}

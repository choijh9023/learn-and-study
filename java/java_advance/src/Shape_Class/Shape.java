package Shape_Class;

public abstract class Shape {
    private String color;

    public abstract double area();

    public Shape(String color) {
        System.out.println("Shape 생성자 클래스 호출 ");
        this.color = color;
    }
    public abstract String toString();
    public String getColor() {

        return color;
    }
}

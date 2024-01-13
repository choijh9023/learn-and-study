package Shape_Class;

public class Circle extends Shape {

    private double radius;
    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle 생성자 클래스 호출");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "원 색삭은 " + super.getColor() + "그리고 면적은 : " +area();
    }


}

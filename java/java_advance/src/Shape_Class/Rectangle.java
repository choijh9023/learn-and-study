package Shape_Class;

public class Rectangle extends Shape{

    private double length;
    private double width;
    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle 생성자 클래스 호출");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {

        return length*width;
    }

    @Override
    public String toString() {
        return "사각형의 색상은" + super.getColor() + " 그리고 면적은 : " + area();}
}

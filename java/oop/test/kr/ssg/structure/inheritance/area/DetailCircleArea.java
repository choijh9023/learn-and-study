package oop.test.kr.ssg.structure.inheritance.area;

public class DetailCircleArea extends OrdinaryCircleArea {
	
	// OrdinaryCircleArea 클래스에서 구한 원의 넓이가 마음에 안들어.
	// DetailCircleArea 클래스에서 pi를 이용하여 정확하게 구하고 싶다.
	// 그러면 OrdinaryCircleArea 클래스에서 구한 원의 넓이를 구하는 메소드를 재정의해서 다시 나타내 주자
	@Override
	public double areaCircle(double r) {
		double area = Math.PI * r * r;
		// System.out.println("DetailCircleArea 클래스에서 구한 원의 넓이는??? " + area);
		return area;
		// return super.areaCircle(r);
	}
	
}

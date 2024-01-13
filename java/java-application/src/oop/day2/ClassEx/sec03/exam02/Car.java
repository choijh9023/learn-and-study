package oop.day2.ClassEx.sec03.exam02;

import oop.day2.hamberger.HamburgerBuilder;

 class Car {
	//필드 선언
//3. 모든 필드는 Private 변경한다.
	private  String company;
	private  String model;
	private  String color;
	private  int maxSpeed ;
	private  int speed;

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}
	//2. 생성자 오버로딩 한다.
	 //모든 클래스의 생성자는 해당 클래스의 접근제한자를 따른다.
	//
	//만약 시그니처가 없으면 디폴트값이다.
	//
	//디폴트는 같은 패키지안에있는건 다 읽어준다.
	//생성자는 메소드와 비슷하지만, 리턴타입이 없고 클래스이름과 동일하다.
	//생성자의 매개변수는 new연산자로 생성자를 호출할때, 매개값을 생성자 블록내부로 전달하는 역할을 한다. //43번라인()
	public Car() {}

	public Car(String Company, String model, String color,int  maxSpeed ,int speed) {
		this.company = Company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;

	}




	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//4. 요구사항 company, model, maxSpeed 는 객체가 생성되면 변경할 수 없고, 읽기만 가능하다. public getter 메소드로

	//5. Speed는 읽기 쓰기가 가능한 메소드로 public getter setter 메소드를 작성

}
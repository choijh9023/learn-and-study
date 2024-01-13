package oop.day2.ClassEx.sec03.exam01;
// 데이터 처리의 기본 기능 : 4가지 ->  CREATE생성//READ읽고//UUDATE업데이트//DELETE지우고//
public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car 그랜저 = new Car("그랜저",false,0);
		Car 트위지 = new Car("트위지",false,0);
		Car 아이오닉 = new Car("아이오닉",false,0);
		Car 모닝 = new Car("모닝",false,0);
		Car 스파크 = new Car("스파크",false,0);

		// 힙영역에 있는 요소들은 초기화를 하지 않으면  저장 될 때 자동 초기화되어서 저장된다.
		//Car 객체의 필드(맴버)값 읽기

		System.out.println(그랜저.modelname);
		System.out.println(그랜저.speed);
		System.out.println(그랜저.start);

		System.out.println(그랜저.modelname);
		System.out.println(그랜저.speed);
		System.out.println(그랜저.start);

		//차가 5대가 있다. 차고에 넣고 싶다. 차고관리 시스템을 만들어라.
		// Car 타입을 저장할 수 있는 배열 myCarArray (5대주차)
		Car[] myCarArray = new Car[5]; //객체형 배열???

		myCarArray[0] = 그랜저;
		System.out.println(myCarArray[0].modelname);
		System.out.println(myCarArray[0].speed);
		System.out.println(myCarArray[0].start);

		//myCarArray 주차공간에 그랜저,
		myCarArray[1] = 아이오닉;
		myCarArray[2] = 트위지;
		myCarArray[3] = 모닝;
		myCarArray[4] = 스파크;
		for (int i = 0; i < myCarArray.length ; i++) {
			System.out.println(myCarArray[i].modelname +" "+ myCarArray[i].start+ " "+ myCarArray[i].speed);

		}
		System.out.println("===========================================위 아래 똑같음 ");
		for (Car car : myCarArray){
			System.out.println(car.modelname+ " "+ car.speed + " " + car.start);
		}
	}
}
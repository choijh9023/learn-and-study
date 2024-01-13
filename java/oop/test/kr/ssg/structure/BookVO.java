package oop.test.kr.ssg.structure;

public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	public BookVO() {
		// 초기화 작업
		/*
		title = "클라우스 슈밥의 제4차 산업혁명";
		price = 15000;
		company = "새로운현재";
		page = 287;
		*/
	}
	
	// 생성자의 중복정의(Overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

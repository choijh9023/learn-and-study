package oop.day2.ClassEx.sec07.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	static {
		info = company + "-" + model;
		}
}
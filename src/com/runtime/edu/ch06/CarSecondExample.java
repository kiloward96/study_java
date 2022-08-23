package com.runtime.edu.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carSecond = new CarSecond();
		String color;
		
//		CarSecond carSecond = new CarSecond("Grey");
		CarSecond carSecond2 = new CarSecond("Grey");
		CarSecond carSecond3 = new CarSecond("White",3000);
		CarSecond carSecond4 = new CarSecond("Green",true);
		String color2 = "Black";
		
		System.out.println("carSecond.color: " + carSecond2.color);
		System.out.println("carSecond.cc:" + carSecond2.cc);
		
		System.out.println("carSecond.color: " + carSecond3.color);
		System.out.println("carSecond.cc:" + carSecond3.cc);
		
		System.out.println("carSecond.color: " + carSecond4.color);
//		System.out.println("carSecond.yn: " + carSecond4.yn);
	}
}

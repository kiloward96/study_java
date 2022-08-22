package com.runtime.edu.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone(); 
		
		
		System.out.println(iphone.name);
		iphone.galaxy();
		
		Car car = new Car();
		
		System.out.println("car.name : " + car.name);
		System.out.println(car.name2[1]);
		
		car.name = "람보르기니";
		
		System.out.println("car.name : " + car.name);
		
		
		Handbag Handbag = new Handbag();
		
		System.out.println("Handbag.name: " + Handbag.name);
		System.out.println("Handbag.name: " + Handbag.name2[1]);
		
		Handbag.brandnew();
	}

}

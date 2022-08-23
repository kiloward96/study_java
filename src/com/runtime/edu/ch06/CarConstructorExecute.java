package com.runtime.edu.ch06;

public class CarConstructorExecute {

	public static void main(String[] args) {
		
		CarConstructor carconstructor = new CarConstructor(); 
		
		CarConstructor carconstructor2 = new CarConstructor("아이오닉");
		
		CarConstructor carconstructor3 = new CarConstructor("Ray",998);
		CarConstructor carconstructor4 = new CarConstructor("캐스퍼",1000,"Olive");
		
		
		
		System.out.println("차종: " + carconstructor.name);
		
		System.out.println("차종: " + carconstructor2.name);
		
		System.out.println("차종: " + carconstructor3.name);
		System.out.println("CC: " + carconstructor3.cc);
		
		System.out.println("차종: " + carconstructor4.name);
		System.out.println("CC: " + carconstructor4.cc);
		System.out.println("색상: " + carconstructor4.color);

	}

}

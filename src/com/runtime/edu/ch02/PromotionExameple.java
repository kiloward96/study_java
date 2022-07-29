package com.runtime.edu.ch02;

public class PromotionExameple {

	public static void main(String[] args) {

		byte byteValue = 10;
		System.out.println("bytetype: " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

//	---------------
		/*
		 * int intValue2 = 1234567890; System.out.println("inttype: " + intValue);
		 * 
		 * byte byteValue2 = intValue2; System.out.println("bytetype2: " + byteValue2);
		 */
		
		int intValue3 = 200;
		System.out.println("intValue3: " + intValue3 + "입니다.");
		
		double doubleValue = intValue3;
		System.out.println("doubleValue3: " + doubleValue + "입니다.");
	}

}

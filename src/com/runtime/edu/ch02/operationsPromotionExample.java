package com.runtime.edu.ch02;

public class operationsPromotionExample {

	public static void main(String[] args) {
		// 
		byte byteValue = 12;
		
		byte byteValue2 = 12;
		
		byte byteValue3 = (byte) (byteValue + byteValue2) ;
		//int intValue = byteValue + byteValue2;
//		System.out.println(byteValue3);
		//System.out.println(intValue);
		
		short shortValue = 12;
		short shortValue2 = 12;
		short shortValue3 = (short) (shortValue + shortValue2);
		int shortValue4 = shortValue + shortValue2;
//		System.out.println(shortValue3);
//		System.out.println(shortValue4);
		
		int intValue = 12;
		int intValue2 = 12;
		int intValue3 = intValue + intValue2;
//		System.out.println(intValue3);
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue + longValue2;
//		System.out.println(longValue3);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
//		System.out.println(floatValue3);
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue + doubleValue2;
//		System.out.println(doubleValue3);
		
		
//		byte byteValue4 = (byte) (byteValue + intValue);
		int intValue4 = (byteValue + intValue);
//		System.out.println(intValue4);
		
		double intValue5 = (intValue + doubleValue);
		System.out.println(intValue5);

	}

}

package com.runtime.edu.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 강제 형변환 : casting : (원하는 형) 변수명

		float floatValue = 123456789;
		System.out.println("floatValue: " + floatValue);
		
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue);
		
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue);
		
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue);
		
		// int > string 변환
		int intValue2 = 123;
		String stringValue = Integer.toString(intValue2);
		System.out.println("int > string : "+ stringValue);
		
		// valueOf 사용
		/*
		 * int intValue3 = 987; String stringValue3 = String.valueOf(intValue3);
		 * System.out.println("ValueOf : " + stringValue3);
		 */
		
		int intValue3 = 987;
		String stringValue3 = intValue3 + "";
		System.out.println("ValueOf : " + stringValue3);
		
		// string > int로 변환
		
		String stringValue2 = "321";
		int intValue4 = Integer.parseInt(stringValue2);
		System.out.println("string > int : "+ intValue4);
		
		short test = 151;
		int test2 = test / 7;
		System.out.println("result : " + test2);
		
	}

}

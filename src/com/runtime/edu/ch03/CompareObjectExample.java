package com.runtime.edu.ch03;

public class CompareObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 10;
		int intValue2 = 20;
		
		boolean result = (intValue == intValue2);
		System.out.println(result);
		
//		if (intValue == intValue2) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}


	
		int intValue3 = 30;
		int intValue4 = 40;
		
		boolean result2 = (intValue3 >= intValue4);
		System.out.println(result2);
		
		boolean result3 = (intValue3 != intValue4);
		System.out.println(result3);
		
		boolean result4 = (intValue3 <= intValue4);
		System.out.println(result4);

	}
}

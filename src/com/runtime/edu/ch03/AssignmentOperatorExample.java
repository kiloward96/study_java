package com.runtime.edu.ch03;

public class AssignmentOperatorExample {
	
	public static void main(String[] args) {
	
		int result = 0;
		
		result += 10;
		
		System.out.println("result : " + result);
		
		int result2 = (result -= 2);
		System.out.println("result2 : " + result2);
		
		int result3 = (result2 *= 3);
		System.out.println("result3 : " + result3);
		
	}

}

package com.runtime.edu.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int x = 1; x <= 10; x++) {
			System.out.println(x);
			sum = x + sum;
		}
		System.out.println("합은 : " + sum);
	}

}

package com.runtime.edu.ch03;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		
		int score = 85;
		
		char grade = score > 90 ? 'A' : 'B' ;
		
		System.out.println("grade: " + grade);
		
		System.out.println("---------------------");
		
		if (grade > 90) {
			System.out.println("Grade : A");
		}
		else {
			System.out.println("Grade : B");
		}

	}

}

package com.runtime.edu.ch04;

public class IfExample {

	public static void main(String[] args) {
		
//		int score = 80;
//		
//		if (score >= 90) {
//			System.out.println("A");
//		}
//		else {
//			System.out.println("B");
//		}
//
//	}
		
		int score = 97;
				if (score >= 90) {
					if (score >= 97) {
						System.out.println("A+입니다.");
					}
					else if (score <= 92 && score >= 90) {
						System.out.println("A-입니다.");
					}
					else {
						System.out.println("A입니다.");
					}
				}
				else if (score >= 80 && score > 70) {
					if (score >= 87) {
						System.out.println("B+입니다.");
					}
					else if (score <= 82 && score >= 80) {
						System.out.println("B-입니다.");
					}
					else {
						System.out.println("B입니다.");
					}
				}
	}
}

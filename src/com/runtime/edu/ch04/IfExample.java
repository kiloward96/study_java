package com.runtime.edu.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 72;
		if (score >= 90) {
			if (score >= 97) {
				System.out.println("A+입니다.");
			} else if (score <= 92 && score >= 90) {
				System.out.println("A-입니다.");
			} else {
				System.out.println("A입니다.");
			}
		} else if (score >= 80 && score > 70) {
			if (score >= 87) {
				System.out.println("B+입니다.");
			} else if (score <= 82 && score >= 80) {
				System.out.println("B-입니다.");
			} else {
				System.out.println("B입니다.");
			}
		} else if (score >= 70 && score > 60) {
			if (score >= 77) {
				System.out.println("C+입니다.");
			} else if (score <= 72 && score >= 70) {
				System.out.println("C-입니다.");
			} else {
				System.out.println("C입니다.");
			}
		} else if (score >= 60 && score > 50) {
			if (score >= 67) {
				System.out.println("D+입니다.");
			} else if (score <= 62 && score >= 60) {
				System.out.println("D-입니다.");
			} else {
				System.out.println("D입니다.");
			}
		} else {
			System.out.println("F입니다.");
		}
	}
}

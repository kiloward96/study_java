package com.runtime.edu.ch04;

public class ForStarExample {

	public static void main(String[] args) {
//		**********
//		**********
//		**********
//		**********
//		**********
//		출력하는 프로그램을 만드시요

//		**********
//		*        *
//		*        *
//		*        *
//		**********
//		출력하는 프로그램을 만드시요

//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시요

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("------------------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i > 1 && i < 5) {
					if (j > 0 && j < 9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("------------------------------");

		for (int i = 1; i <= 11; i++) {
			for (int j = 1; j < i; j++) {
				if (i == 11 && j > 1 && j < 9 && j%2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(j % 10);
				}
			}
			System.out.println();
		}

	}
}

package com.runtime.edu.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {

		// 2단 출력 프로그램

//		int dan = 2;
//		
//		for (int i=1; i<=9; i++) {
//			System.out.println(dan + "X" + i + "=" + (dan*i));
//		}

		// 2단 ~ 9단까지 출력프로그램 작성 : 6줄 이상 되지 않게
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 6) {
					System.out.println(i + "X" + j + "=" + (i * j) + "\n");
				} else {
					System.out.println(i + "X" + j + "=" + (i * j));
				}
			}
		}
	}
}

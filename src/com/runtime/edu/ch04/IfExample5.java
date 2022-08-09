package com.runtime.edu.ch04;

public class IfExample5 {

	public static void main(String[] args) {

		int intValue = -1;
		int checker = intValue % 2;

		if (checker != 0) {
			System.out.println("홀");
		} else if (checker == 0) {
			System.out.println("0");
		} else {
			System.out.println("짝");
		}

	}

}

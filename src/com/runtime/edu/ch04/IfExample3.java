package com.runtime.edu.ch04;

public class IfExample3 {

	public static void main(String[] args) {

		int versus1 = 20;
		int versus2 = 30;

		if (versus1 > versus2) {
			int bigger = versus1 - versus2;
			System.out.println("versus1이 versus2보다 " + bigger + " 만큼 큽니다.");
		} else if (versus1 < versus2) {
			int bigger = versus2 - versus1;
			System.out.println("versus2가 versus1보다 " + bigger + " 만큼 큽니다.");
		} else {
			System.out.println("두 값은 동일합니다.");
		}

	}

}

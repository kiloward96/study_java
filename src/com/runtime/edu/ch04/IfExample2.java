package com.runtime.edu.ch04;

public class IfExample2 {

	public static void main(String[] args) {

		int price = 5000;
		int tier = 0;

		if (tier == 1) {
			int discount = (int) (price - (price * 0.05));
			System.out.println("정가: " + price + " 일반 5% 할인가: " + discount);
		} else if (tier == 2) {
			int discount = (int) (price - (price * 0.1));
			System.out.println("정가: " + price + " 브론즈 10% 할인가: " + discount);
		} else if (tier == 3) {
			int discount = (int) (price - (price * 0.15));
			System.out.println("정가: " + price + " 실버 15% 할인가: " + discount);
		} else if (tier == 4) {
			int discount = (int) (price - (price * 0.2));
			System.out.println("정가: " + price + " 골드 20% 할인가: " + discount);
		} else if (tier == 5) {
			int discount = (int) (price - (price * 0.027));
			System.out.println("정가: " + price + " 플래티넘 2.7% 할인가: " + discount);
		} else {
			System.out.println("회원이 아닙니다. 가입해주세요");
		}
	}

}

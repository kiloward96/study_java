package com.runtime.edu.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		
		int price = 5000;
		int tier = 2;
		int discount = 0;
		
		switch (tier) {
		case 1:
			discount = (int) (price - (price * 0.05));
			System.out.println("정가: " + price + " 일반 5% 할인가: " + discount);
			break;
		case 2:
			discount = (int) (price - (price * 0.1));
			System.out.println("정가: " + price + " 브론즈 10% 할인가: " + discount);
			break;
		case 3:
			discount = (int) (price - (price * 0.15));
			System.out.println("정가: " + price + " 실버 15% 할인가: " + discount);
			break;
		case 4:
			discount = (int) (price - (price * 0.2));
			System.out.println("정가: " + price + " 골드 20% 할인가: " + discount);
			break;
		case 5:
			discount = (int) (price - (price * 0.027));
			System.out.println("정가: " + price + " 플래티넘 2.7% 할인가: " + discount);
			break;
		default:
			System.out.println("회원이 아닙니다. 가입해주세요");
			break;
		}
		
	}

}

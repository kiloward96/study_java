package com.runtime.edu.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		int price = 5000;
		int tier = 5;
				
				if (tier == 1) {
					int discount = (int) (price - (price * 0.05));
					System.out.println("할인가: " + discount);
				}
				else if (tier == 2) {
					int discount = (int) (price - (price * 0.1));
					System.out.println("할인가: " + discount);
				}
				else if (tier == 3) {
					int discount = (int) (price - (price * 0.15));
					System.out.println("할인가: " + discount);
				}
				else if (tier == 4) {
					int discount = (int) (price - (price * 0.2));
					System.out.println("할인가: " + discount);
				}
				else if (tier == 5) {
					int discount = (int) (price - (price * 0.27));
					System.out.println("할인가: " + discount);
				}
				else {
					int discount = price;
					System.out.println("정가: " + discount);
				}
					

	}

}

package com.runtime.edu.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		// && = & : and : 논리곱 : 연산 참 참 참, 나머지 폴스
		// || = | : or : 논리합 : 연산 참 참 참, 참 참 폴스, 폴스 참 참, 폴스 폴스 폴스
		// ^ : 배타적 논리합 : 
		
		int a = 65;
		
		boolean result = (a >= 65);
		System.out.println(result);
		
		boolean result2 = (a <= 90);
		System.out.println(result2);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("-----------------------------");
		
		if(a >= 65 | a <= 90) {
			System.out.println("둘다 참.");
		}
		if(a >= 65 | a <= 90) {
			System.out.println("한개만 참.");
		}
		if(a >= 66 | a <= 50) {
			System.out.println("둘다 구라.");
		}
		
		if(a >= 65 || a <= 90) {
			System.out.println("둘다 참.");
		}
		if(a >= 65 || a <= 90) {
			System.out.println("한개만 참.");
		}
		if(a >= 66 || a <= 50) {
			System.out.println("둘다 구라.");
		}

		System.out.println("-----------------------------");
		
		if(a >= 65 ^ a <= 50) {
			System.out.println("한개만 참임");
		}
		
		if(a >= 66 ^ a <= 90) {
			System.out.println("둘다 참");
		}
		
		if(a >= 63 ^ a <= 66) {
			System.out.println("둘다 구라");
		}

	}
}

package com.runtime.edu.ch04;

public class RandomSum {

	public static void main(String[] args) {
		// 1 ~ 100 사이의 랜덤 정수 2개를 발생
		// 두 수 사이의 합을 구하라

		double min = 1;
		double max = 100;
		int random = (int) ((Math.random() * (max - min) + min));
		int random2 = (int) ((Math.random() * (max - min) + min));
		int result = 0;
		
		if (random > random2) {
			for (int i = (random-1); i > random2; i--) {
				result +=  i;
				System.out.println("random = " + random + " , random2 = " + random2 + " 사이의 합은 : " + result);
			}
		}
		else if (random < random2) {
			for (int i = (random+1); i < random2; i++) {
				result +=  i;
				System.out.println("random = " + random + " , random2 = " + random2 + " 사이의 합은 : " + result);
			}
		}
		else {
			System.out.println("두 난수는 동일값입니다." + " random값 : " + random + " random2값 : " + random2);
		}
	}
}

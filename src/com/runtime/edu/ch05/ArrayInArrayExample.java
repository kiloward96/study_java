package com.runtime.edu.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] scores = {{99,88,55},{55,77,66},{55,55,54},{55,55,54},{55,55,57}};
		
		System.out.println("score[][] = " + scores[4][2]);
		
		System.out.println("score[][] = " + scores[2][0]);
		
		System.out.println("score[][] = " + scores[0][1]);
		
		// 1 중간고사 2 장동건 중간고사영어 3 고소영 중간고사 4 blabla 5 블라블라 국영수순
		
		// 1 개인의 평균 2 과목별 평균
		
		System.out.println(scores[0].length);
		
		int sum = 0;
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		
		// 나의 중간고사
		for (int i=0; i<scores[0].length; i++) {
			sum += scores[0][i];
		}
		
		double avg = sum / scores[0].length;
		
		// 국어
		for (int i=0; i<scores.length; i++) {
			korSum += scores[i][0];
		}
		double korAvg = korSum / scores.length;
		
		// 영어
		for (int i=0; i<scores.length; i++) {
			engSum += scores[i][1];
		}
		double engAvg = engSum / scores.length;
		
		// 수학
		for (int i=0; i<scores.length; i++) {
			mathSum += scores[i][2];
		}
		double mathAvg = mathSum / scores.length;
		
		System.out.println("나의 중간고사 평균 : " + avg);
		System.out.println("국어 중간고사 평균 : " + korAvg);
		System.out.println("영어 중간고사 평균 : " + engAvg);
		System.out.println("수학 중간고사 평균 : " + mathAvg);
	}

}

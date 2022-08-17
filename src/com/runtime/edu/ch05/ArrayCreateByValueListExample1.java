package com.runtime.edu.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scoreEnglish;
		int scoreMath[];

		int[] scoreChemistry = { 88, 99, 45, 86, 34 };

		String[] name = { "이규관", "김기역", "이니은", "박디귿", "신시옷" };

		System.out.println("성적 : " + scoreChemistry[1]);

		System.out.println("who am i? : " + name[2]);

		// scoreChemistry의 평균을 구해서 출력하시오

		// System.out.println(scoreChemistry.length);

		int sum = 0;

//		for (int i = 0; i < 4; i++) {
//			System.out.println("성적 : " + scoreChemistry[i]);
//			
//			result += scoreChemistry[i];
//			
//		}
//		System.out.println("모두의 화학 평균: " + result / 5);

		for (int i = 0; i < scoreChemistry.length; i++) {
			System.out.println("성적 : " + scoreChemistry[i]);

			sum += scoreChemistry[i];

		}
		double result = sum / scoreChemistry.length;

		System.out.println("모두의 화학 평균: " + (int) result);

	}

}

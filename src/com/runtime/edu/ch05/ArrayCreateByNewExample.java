package com.runtime.edu.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
		// 배열 데이터 추가 방식 1
		int[] arr1 = new int[3];
		
		// 배열 데이터 추가 방식 2		
		int[] arr2;
		arr2 = new int[5];
		
//		arr1[0] = 77;
//		System.out.println("arr1[0] : " + arr1[0]);
//		
//		arr1[1] = 66;
//		System.out.println("arr1[0] : " + arr1[1]);
//		
//		arr1[2] = 55;
//		System.out.println("arr1[0] : " + arr1[2]);

		int min = 1;
		int max = 45;
		
		int[] lottery = new int[7];
		int[] diff = new int [7];
		
		for (int i=0; i < lottery.length; i++) {
			int random = (int) ((Math.random() * (max - min) + min));
			lottery[i] = random;
				if (i == lottery.length-1) {
					System.out.println("+ 보너스 로또 번호 : " + lottery[lottery.length-1]);
				}
				else {
					System.out.println(i+1 + " 번째 로또 번호 : " + lottery[i]);
				}
		}
	}
}

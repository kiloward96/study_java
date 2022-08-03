package com.runtime.edu.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		
//		  int v1 = 5; int v2 = 2;
//		  
//		  int result1 = v1 + v2; System.out.println("result1: " + result1);
//		  
//		  int result2 = v1 - v2; System.out.println("result2: " + result2);
//		  
//		  int result3 = v1 * v2; System.out.println("result3: " + result3);
//		  
//		  int result4 = v1 / v2; System.out.println("result4: " + result4);
//		  
//		  int result5 = v1 % v2; System.out.println("result5: " + result5);
//		  
//		  
//	/*	  double result6 = v1 / v2; 
//		  System.out.println(result6);*/
//		  
//		  
//		  // 나머지가 소수점으로 떨어질경우 변수 형식과 casting을 통해 실수형으로 변경해야만 소수점단위로 결과출력 double result7
//		  = (double) v1 / v2; 
//		  System.out.println(result7);
//		  
//		 
//		
//		
//		
//		
//		  sum(8,7,5); 
//		  sum(1,9,5); 
//		  sum(5,6,6); 
//		  sum(4,7,1);
		 
		
		
		avg("a",60,70,85,90,45);
		avg("b",50,75,70,60,70);
		avg("c",50,75,70,60,70);
		avg("d",55,60,64,58,90);
		avg("e",80,70,63,88,78);
		
		
		
	}
		public static void avg(String name, int english, int math, int physics, int music, int athletic) {
			System.out.println(name + "평균 = " + (double) (english + math + physics + music + athletic) / 5);
			
		}
	
		
		  public static void sum(int a, int b, int c) {
		  
		  
		  System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c) ); }
		 
}
		

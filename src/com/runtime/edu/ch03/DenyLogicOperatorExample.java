package com.runtime.edu.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {

		boolean play = true;
		System.out.println("play: " + play);
		
		play = !play;
		System.out.println("play: " + play);
		
		play = !play;
		System.out.println("play: " + play);
		
		boolean test = true;
		
		
		if (!(test == false)) {
			System.out.println("진또배기");
			}
		else {
				System.out.println("구라임");
			}
		
		
		if (test != true) {
			System.out.println("진또배기");
		}
		else {
			System.out.println("구라임");
		}
		  double a1 = 3; 
		  double a2 = 1; 
		  double a3 = 2;
		  
		  double b1 = 8; 
		  double b2 = 5;
		  
		  double c1 = 5; 
		  double c2 = 9; 
		  double c3 = 4;
		  
		  
		  double aResult = (a1 * a2 + a3) / a1; 
		  double bResult = b1 / b2; double
		  abResult = aResult - bResult; double cResult = (c1 * c2 + c3) / c1;
		  
		  double abcResult = (abResult * cResult); System.out.println(abcResult);
		  
		  double a = 5;
		  
		  double b = 3.25; double d1 = 6; double d2 = 1; double d3 = 5;
		  
		  double e1 = 17; double e2 = 12;
		  
		  double abdeResult = a - (b - (d1 * d2) / d3) * (e2 / e1);
		  System.out.println(abdeResult);
		 
	}
	
	

}

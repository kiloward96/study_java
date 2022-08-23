package com.runtime.edu.ch06;

public class CarSecond {
	
	String color = "red";
	int cc = 1500;
	boolean stock = true;
	
	
	CarSecond (String str) {
		color = str;
	}
	
	CarSecond (String str, int num) {
		color = str;
		cc = num;
	}
//	기본생성자
	CarSecond (){
		
	}
	
	CarSecond (String str, boolean yn){
		color = str;
		stock = yn;
	}	
	
}

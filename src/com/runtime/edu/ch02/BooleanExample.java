package com.runtime.edu.ch02;

public class BooleanExample {

	public static void main(String[] args) {

		boolean stop = false;
		int test = 1;
		
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println(os);
		
		
		if(stop != true && test != 0 ) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		
			
		}
		
	}

}

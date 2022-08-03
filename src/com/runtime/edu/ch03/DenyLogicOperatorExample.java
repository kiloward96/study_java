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
	}

}

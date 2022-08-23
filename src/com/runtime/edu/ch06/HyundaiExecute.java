package com.runtime.edu.ch06;

public class HyundaiExecute {

	public static void main(String[] args) {

		Hyundai hyundai = new Hyundai();

		for (int i = 0; i < hyundai.name.length; i++) {
			System.out.println("현대자동차 : " + hyundai.name[i]);
		}
	}
}

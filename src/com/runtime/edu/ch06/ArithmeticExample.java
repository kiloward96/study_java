package com.runtime.edu.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
//		클래스		변수				생성자

		int resultAdd = arithmetic.calcAdd(10, 12);
		int resultMin = arithmetic.calcMin(10, 12);
		int resultMulti = arithmetic.calcMulti(10, 12);
		int resultDivid = arithmetic.calcDivid(10, 12);
		int resultRemind = arithmetic.calcRemind(10, 12);

		arithmetic.calcResult(resultAdd);
		arithmetic.calcResult(resultMin);
		arithmetic.calcResult(resultMulti);
		arithmetic.calcResult(resultDivid);
		arithmetic.calcResult(resultRemind);
		
	}
}

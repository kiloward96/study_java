package com.runtime.edu.test;

public class ComputerExample {

	public static void main(String[] args) {

		int param = 7;

		System.out.println("원의 반지름: " + param);

		System.out.println("");

		Calculator calculator = new Calculator();

		System.out.println("원면적: " + calculator.calc(param));

		System.out.println("");

		Computer computer = new Computer();

		System.out.println("원면적: " + computer.calc(param));

	}

}

package com.runtime.edu.ch04;

public class IfExample6 {

	public static void main(String[] args) {

		int value1 = 1;
		int value2 = 7;
		int value3 = 1;

		if (value1 > value2 && value1 > value3) {
			if (value2 > value3) {
				System.out.println("value1이 최대값 value3이 최소값.");
			} else if (value1 == value2) {
				System.out.println("value1이 최대값 value2,value3이 최소값");
			} else {
				System.out.println("value1이 최대값 value2가 최소값.");
			}
		} else if (value2 > value1 && value2 > value3) {
			if (value1 > value3) {
				System.out.println("value2이 최대값 value3이 최소값.");
			} else if (value1 == value2) {
				System.out.println("value2이 최대값 value1,value3이 최소값");
			} else {
				System.out.println("value2이 최대값 value1,value3이 최소값.");
			}
		} else if (value3 > value1 && value3 > value2) {
			if (value1 > value2) {
				System.out.println("value3이 최대값 value2이 최소값.");
			} else if (value1 == value2) {
				System.out.println("value3이 최대값 value1,value2가 최소값");
			} else {
				System.out.println("value3이 최대값 value1가 최소값.");
			}
		} else if (value1 == value2 && value1 > value3) {
			System.out.println("value1, value2가 최대값 value3이 최소값");
		} else if (value2 == value3 && value2 > value1) {
			System.out.println("value2, value3이 최대값 value1이 최소값");
		} else if (value1 == value3 && value1 > value2) {
			System.out.println("value1, value3이 최대값 value2이 최소값");
		} else {
			System.out.println("셋 다 같다");
		}

	}

}

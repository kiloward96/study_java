package com.runtime.edu.ch04;

public class IfExample4 {

	public static void main(String[] args) {

		int x = 0;
		int y = 1;

		if (x > 0 && y > 0) {
			System.out.println("제 1사분면");
		} else if (x < 0 && y > 0) {
			System.out.println("제 2사분면");
		} else if (x < 0 && y < 0) {
			System.out.println("제 3사분면");
		} else if (x > 0 && y < 0) {
			System.out.println("제 4사분면");
		} else if (x == 0 && y != 0) {
			System.out.println("좌표가 y축에 위치");
		} else if (x != 0 && y == 0) {
			System.out.println("좌표가 x축에 위치");
		} else {
			System.out.println("원점 0.0에 위치합니다.");
		}
	}

}

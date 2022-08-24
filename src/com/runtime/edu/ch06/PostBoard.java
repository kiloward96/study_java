package com.runtime.edu.ch06;

public class PostBoard {

	static String name = "TESTU";
	static int view = 200;
	static boolean useYn = false;

	PostBoard (String name) {
		this.name = name;
	}
	PostBoard (String name, int view) {
		this.name = name;
		this.view = view;
	}
	PostBoard (String name, boolean useYn) {
		this.name = name;
		this.useYn = useYn;
	}
	PostBoard (String name, int view, boolean useYn) {
		this.name = name;
		this.view = view;
		this.useYn = useYn;
	}
	PostBoard () {
	}
	
	static int staTest (int a) {
		return a + 10;
	}
	
	public static void test(int result) {
		System.out.println(result);
	}
	
	public static void execute() {
		System.out.println("이름: " + name + " | 조회수: " + view + " | 사용여부: " + useYn);
	}
}

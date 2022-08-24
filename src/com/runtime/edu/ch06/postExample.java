package com.runtime.edu.ch06;

public class postExample {

	public static void main(String[] args) {

//		PostBoard postboard = new PostBoard();
//		
//		
//		PostBoard postboard1 = new PostBoard("이니은",321456);
//		PostBoard postboard2 = new PostBoard("이니영",true);
//		PostBoard postboard3 = new PostBoard("박디귿",98765,true);
		
//		PostBoard.execute();
//		PostBoard1.execute();
//		PostBoard2.execute();
//		PostBoard3.execute();
		
		System.out.println(PostBoard.name);
		PostBoard.execute();
		
		int owl = PostBoard.staTest(5);
		
		PostBoard.test(owl);
		
		Car.aaa();
	}

}

package com.runtime.edu.ch13.third;

import com.runtime.edu.ch13.first.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {

//			Box<String> box = new Box<String>();

		Box<String> box = Util.<String>boxing("oh");
		String rtInt = box.get();

		System.out.println("rtInt: " + rtInt);

		Box<Boolean> box2 = Util.<Boolean>boxing(false);
		boolean rtString = box2.get();

		System.out.println("rtString: " + rtString);
	}
}

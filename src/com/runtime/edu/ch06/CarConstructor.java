package com.runtime.edu.ch06;

public class CarConstructor {

	String name = "아반떼";
	int cc;
	String color;
	
	CarConstructor (String name) {
		this.name = name;
	}
	
	CarConstructor (String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	
	CarConstructor (String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}

	CarConstructor() {
		
	}
}

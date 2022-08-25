package com.runtime.edu.ch07.second;

public class Student extends People{

	public int studentNo;
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	public void says() {
		System.out.println("이름: " + name + " | 주민번호: " + ssn + " | 학번: " + studentNo);
	}
	public Student() {
	}
}

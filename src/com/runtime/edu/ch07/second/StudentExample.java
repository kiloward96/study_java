package com.runtime.edu.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		// 명시적 생성자를 사용하여 객체를 생성하고
		// 모든 필드를 출력하시오

		Student student = new Student("김기역", "222222-111111", 13);

		student.says();

		Student student2 = new Student("김가나", "111111-222222", 23);

		student2.says();
	}
}

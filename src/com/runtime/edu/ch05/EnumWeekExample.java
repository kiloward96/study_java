package com.runtime.edu.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week abc;
		Week xyz;
		
		
//		abc = 1;
		
		abc = Week.WEDNESDAY;
		
		System.out.println(Week.FRIDAY);
		System.out.println(abc);
		
		String name = abc.name();
		System.out.println("name : " + name);
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal : " + ordinal);
		
		xyz = Week.FRIDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + ": day: " + day);
			index++;
		}

	}

}

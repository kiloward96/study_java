package com.runtime.edu.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		int k = i++;
		System.out.println(k);
		System.out.println(i);
		
		int m = ++j;
		System.out.println(m);
		System.out.println(j);
		
		int z = ++i + j++;
		System.out.println(z);
		System.out.println(i);
		System.out.println(j);
		
	}

}

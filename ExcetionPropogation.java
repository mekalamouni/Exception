package com.mouni.Exception;

public class ExcetionPropogation {

	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");

	}

	static void m1() {
		System.out.println("m1 starts");
		try {
			m2();
			
		} catch (ArithmeticException e) {
           System.out.println("Exception Handled");
		}
	
		System.out.println("m1 ends");

	}

	static void m2() {
		System.out.println("m2 starts");
		int c = 5 / 0;
		System.out.println("m2 ends");
	}

}

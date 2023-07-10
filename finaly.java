package com.mouni.Exception;

public class finaly {

	public static void main(String[] args) {
		System.out.println("main starts");
		try {
		int c=3/0;
			
		} finally {
			System.out.println("finally");
		}
		System.out.println("main ends");
	}

}

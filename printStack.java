package com.mouni.Exception;

public class printStack {

	public static void main(String[] args) {
		System.out.println("main start");
		try {
			int a=10/0;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main ends");

	}

}

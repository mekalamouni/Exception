package com.mouni.Exception;

public class Demo {

	public static void main(String[] args) {
		int a=m1();
		System.out.println(a);

	}
	static int m1() {
		try {
		System.out.println("try");
		return 10;
		
	}
	finally{
		System.out.println("finally");
	}

	

}}

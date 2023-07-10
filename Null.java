package com.mouni.Exception;

public class Null {

	public static void main(String[] args) {
		String s="mouni";
		int n=0;
		try {
			n=s.length();
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("exception handled");
		}
		System.out.println(n);

	}

}

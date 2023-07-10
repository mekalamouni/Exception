package com.mouni.Exception;

public class NumberFormate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="70";
		int n=0;
		try {
			n=Integer.parseInt(s);
			
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			
		}
		System.out.println(n);

	}

}

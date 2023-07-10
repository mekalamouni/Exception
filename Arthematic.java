package com.mouni.Exception;

import java.util.Scanner;

public class Arthematic{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter two numers");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=0;
		try {
			System.out.println("try Start");
			c=a/b;
			System.out.println("try end");
			
		}catch (ArithmeticException e) {
			System.out.println("catch excuted");
			c=a/2;
	
		}
		System.out.println(c);

	}

}

package com.mouni.Exception;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter a number");
	 int n=0;
	 while(true) {
		 try {
			 String s=scn.next();
			 n=Integer.parseInt(s);
			 break;
		 }catch (NumberFormatException e) {
			System.out.println("Wrong input pls enter a number");
		}
	 }
		 System.out.println("n ="+n);
		 
	 

	}

}

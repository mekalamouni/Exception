package com.mouni.Exception;

import java.util.Scanner;

class Account {
	private int bal;

	public Account(int b) {
		bal = b;
	}

	public int getBal() {
		return bal;

	}
	public void WithDraw(int amt) throws InsufficientBalException{
		if(amt>bal) {
			throw new InsufficientBalException();
		}
		bal=bal-amt;
		
	}
}
class InsufficientBalException extends Exception{
	public InsufficientBalException() {
		super("less balance");
	}
	public InsufficientBalException(String s) {
		super(s);
	}
}

public class BankApp {

	public static void main(String[] args) {
		Account a1=new Account(2000);
		Scanner scn=new Scanner(System.in);
		System.out.println("amount");
		int a=scn.nextInt();
		try {
			a1.WithDraw(a);
			System.out.println("amount with draw");
			System.out.println("ur current balance="+a1.getBal());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}

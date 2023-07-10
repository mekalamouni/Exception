package com.mouni.Exception;
class A extends Exception{
	
}

public class Checked{

	public static void main(String[] args)  {
		System.out.println("main starts ");
		try {
			m1();
		} catch (A e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("handled");
		}

	}
	static void m1() throws A{
		System.out.println("m1 starts");
		throw new A();
	}

}

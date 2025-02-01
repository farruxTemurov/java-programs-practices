package com;

public class methodOverloading {
	// Rules for overloading
	// Method names should be the same
	// Unique argument list (increase/decrease the argument list, change the
	// sequence)
	// return type Does NOT play a role

	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Result is " + result);
	}

	void add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println("Result is " + result);
	}

	public static void main(String[] args) {
		methodOverloading ref = new methodOverloading();
		ref.add(12, 14);
		ref.add(122, 42, 90);
	}

}

package com;

import java.util.Scanner;

public class Methods {

	// non-static method | Executed with object's reference
	int getMax(int[] array) {

		int max = array[0];
		for (int idx = 1; idx < array.length; idx++) {
			if (array[idx] > max) {
				max = array[idx];
			}
		}
		return max;
	}

	// static method | executed by class name
	static int getMaxFromArray(int[] array) {
		int max = array[0];
		for (int idx = 1; idx < array.length; idx++) {
			if (array[idx] > max) {
				max = array[idx];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] productPrices = { 1200, 2100, 2400, 1294, 1099 };
		int[] cricketerScores = { 12, 32, 40, 76, 71, 14 };
		int[] covidCases = { 74134, 24223, 24802, 284112 };
		String names = "John, Jim, Jakes, Mike, Silver";
		String email = "john@example.com";
		String password = "john@123"; // it stores the refernce of the object.

		// object construction statement
		Methods ms = new Methods();
		System.out.println("Max in productPrices is " + ms.getMax(productPrices));
		System.out.println("Max in productPrices is " + ms.getMax(cricketerScores));
		System.out.println("Max in productPrices is " + ms.getMax(covidCases));

		// static method can be executed without object construction statement
		System.out.println("________________");
		System.out.println("Max in productPrices is " + ms.getMaxFromArray(productPrices));
		System.out.println("Max in productPrices is " + ms.getMaxFromArray(cricketerScores));
		System.out.println("Max in productPrices is " + ms.getMaxFromArray(covidCases));

		// String methods

		String subString = names.substring(6, 9);
		System.out.println("subString from index 6 to 9 is " + subString);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email");
		String userEmail = sc.next();

		System.out.println("Enter the password");
		String userPassword = sc.next();

//		if (email.equals(userEmail) && password.equals(userPassword)) {
//			System.out.println("Email and password matched");
//		} else {
//			System.out.println("Email and password didn't match");
//		}
		
		if (email.equalsIgnoreCase(userEmail) && password.equals(userPassword)) {
			System.out.println("Email and password matched");
		} else {
			System.out.println("Email and password didn't match");
		}

	}

}

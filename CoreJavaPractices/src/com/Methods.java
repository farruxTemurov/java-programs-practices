package com;

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

		// object construction statement
		Methods ms = new Methods();
		System.out.println("Max in productPrices is " + ms.getMax(productPrices));
		System.out.println("Max in productPrices is " + ms.getMax(cricketerScores));
		System.out.println("Max in productPrices is " + ms.getMax(covidCases));
	}

}

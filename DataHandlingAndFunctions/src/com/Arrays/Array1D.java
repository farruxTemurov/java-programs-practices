package com.Arrays;

public class Array1D {
	public static void main(String[] args) {

		int a1[], a2; // only a1 is array
		int[] a3, a4; // both a3, a4 are array

		int covidCases[] = { 432, 42141, 21, 5423 };

		int[] data = covidCases; // Reference Copy Operation
		// HasCode of covidCases is copied into data
		System.out.println("Data is: " + data);

		data[1] = 1212; // when I change second property of data, covidCases will also be changed
		System.out.println("covidCases[1]: " + covidCases[1]);

		System.out.println("Iterating in 1D array");
		for (int idx = 0; idx < covidCases.length; idx++) {
			System.out.println("covidCases[" + idx + "] is: " + covidCases[idx]);
		}

		System.out.println("Iterating with enhanced for loop");
		for (int element : covidCases) { // initially zeroth index of covidCases will be copied, and continue with the
											// rest, meaning no index management here!
			System.out.println("Element is: " + element);
		}

	}
}

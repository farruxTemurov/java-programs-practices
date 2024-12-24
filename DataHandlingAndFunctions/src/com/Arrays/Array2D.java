package com.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int covidCasesState1[] = { 312, 12342, 83, 8981 };
		int covidCasesState2[] = { 142, 8974, 63, 1233 };
		int covidCasesState3[] = { 363, 3521, 92, 1029 };

		// 2D Arrays --> Array of Arrays
		int[][] covidCases = { { 312, 12342, 83, 8981 }, { 142, 8974, 63, 1233 }, { 363, 3521, 92, 1029 } };

		System.out.println("covidCases array is " + covidCases + " and length is: " + covidCases.length);

		// int[][] array2D = new int[5][3]; // 5 1-D arrays with 3 elements each
		int[][] array2D = new int[5][]; // 5 1-D arrays but elements are not decided yet
		array2D[0] = new int[3];
		array2D[3] = new int[10];

		for (int i = 0; i < covidCases.length; i++) {
			for (int j = 0; j < covidCases[i].length; j++) {
				System.out.print(covidCases[i][j] + " ");
			}
			System.out.println();
		}

		for (int[] array : covidCases) {
			for (int element : array) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}

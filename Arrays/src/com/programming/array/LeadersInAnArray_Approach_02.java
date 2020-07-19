package com.programming.array;

public class LeadersInAnArray_Approach_02 {

	public static void leadersInArray(int arr[]) {

		int CURRENT_MAX = Integer.MIN_VALUE;

		int len = arr.length - 1;
		System.out.print("Leaders In An Array are  =>");

		for (int i = len; i >= 0; i--) {

			if (arr[i] > CURRENT_MAX) {
				System.out.print(arr[i] + "  ");
				CURRENT_MAX = arr[i];
			}

		}

	}

	public static void main(String[] args) {

		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		leadersInArray(arr);

		// -------------- out Put ---------------------
		/*
		 * 
		 * Leaders In An Array are =>2 5 17
		 * 
		 */

	}

}

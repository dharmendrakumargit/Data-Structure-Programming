package com.programming.array;

//Author @ Dharmendra Kumar 19 july 2020

public class LeadersInAnArray_Approach_01 {

	public static void leadersInArray(int arr[]) {

		int len = arr.length;
		System.out.print("Leaders in An Array are =>");

		for (int i = 0; i < len; i++) {
			int j;
			for (j = i + 1; j < len; j++) {

				if (arr[i] <= arr[j]) {
					break;
				}

			}
			if (j == len) {
				System.out.print(arr[i] + " ");
			}

		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		leadersInArray(arr);

		// -------------- out Put ---------------------
		/*
		 * 
		 * Leaders in An Array are =>17 5 2
		 * 
		 */
	}

}

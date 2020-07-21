package com.programming.array;

//Author @ Dharmendra Kumar 21 july 2020

/* if (i<j) and (A[i]>A[j]) then the pair(i,j) is called an inversion of an array A.
We need to count all such pairs in the array.
If array is already sorted then inversion count is 0. 
If array is sorted in reverse order that inversion count is the maximum. 
*/

public class InversionCount {

	public static int getInversionCount(int arr[]) {

		int inversionCount = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					inversionCount++;
					System.out.println("( " + arr[i] + ", " + arr[j] + ")");
				}

			}

		}

		return inversionCount;

	}

	public static void main(String as[]) {

		int arr[] = { 1, 9, 6, 4, 5 };
		int num = getInversionCount(arr);
		System.out.println("Inversion Count is : " + num);
		
		// OUT PUT 
		
	/*  ( 9, 6)
		( 9, 4)
		( 9, 5)
		( 6, 4)
		( 6, 5)
		Inversion Count is : 5  */


	}

}

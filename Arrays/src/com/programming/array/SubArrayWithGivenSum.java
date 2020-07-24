package com.programming.array;
//Author @ Dharmendra Kumar 24 july 2020

// Find subarray with given sum
//Input: arr[] = {0, 4, 0, 0, 4, 10, 5}, sum = 8
//Ouptut: Sum found between indexes 1 and 4
//Sum of elements between indices
// 1 and 4 is 4 + 0 + 0 + 4 = 8

public class SubArrayWithGivenSum {

	public static void findSubArrayWithGivenSum(int arr[], int givenSun) {

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int sum = 0;

			for (int j = i; j < len; j++) {

				sum += arr[j];
				if (sum == givenSun) {
					System.out.println("For Given Sum :" + givenSun);
					System.out.println("Sub Array Starting Index:-> " + i + "   End Index :-> " + j);
					break;
				}

			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 0, 0, 0, 4, 9, 10 };
		int givenSum = 8;
		findSubArrayWithGivenSum(arr, givenSum);
		// OUT PUT is below ..
		// For Given Sum :8
		// Sub Array Starting Index:-> 1 End Index :-> 5

	}

}

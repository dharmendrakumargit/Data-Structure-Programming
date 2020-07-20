package com.programming.array;

// Author @ Dharmendra Kumar 20 july 2020
// MergeTwoSortedArray -- This logic is similar to Merging Logic of Merge Sort

public class MergeTwoSortedArray {

	public static int[] mergeSortedArray(int arr1[], int arr2[]) {

		int m = arr1.length, n = arr2.length;
		int len = m + n;
		int[] temp = new int[len];
		int left = 0, right = 0, k = 0;

		while (left < m && right < n) {
			if (arr1[left] < arr2[right]) {
				temp[k++] = arr1[left++];
			} else {
				temp[k++] = arr2[right++];
			}

		}
		while (left < m) {
			temp[k++] = arr1[left++];
		}
		while (right < n) {
			temp[k++] = arr2[right++];
		}

		return temp;
	}

	public static void main(String[] args) {

		int[] arr1 = { 5, 7, 9, 11 };

		int[] arr2 = { 6, 8, 10, 12 };

		int arr[] = mergeSortedArray(arr1, arr2);

		System.out.println("Array after merging");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		// OUT PUT is below
		/*
		   Array after merging 
		   5 6 7 8 9 10 11 12
		 */

	}

}

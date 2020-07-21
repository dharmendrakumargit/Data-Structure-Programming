package com.programming.array;

import java.util.Arrays;

//Author @ Dharmendra Kumar 21 july 2020

/*  Given an array of integers, print the array in such a way that 
    the first element is first maximum and second element is first minimum and so on. */

public class AlternateSorting {

	public static int[] rearrangeArray(int arr[]) {

		int len = arr.length;
		int temp[] = new int[len];
		int start = 0, end = arr.length - 1;
		int k = 0;
		Arrays.sort(arr);
		while (start < end) {
			temp[k++] = arr[end--];
			temp[k++] = arr[start++];

		}
		// Mentioned below condition to handle odd Number of elements in an array
		if (len % 2 != 0) {
			temp[k++] = arr[start];

		}
		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int altSortedArray[] = rearrangeArray(arr);

		for (int i : altSortedArray) {
			System.out.print(i + " ");

		}

	}

}

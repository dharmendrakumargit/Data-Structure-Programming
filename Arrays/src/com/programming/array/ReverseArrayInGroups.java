package com.programming.array;

// Author @ Dharmendra Kumar 19 july 2020

public class ReverseArrayInGroups {

	public static int[] reverseInGroups(int arr[], int groupSize) {
		int len = arr.length;

		for (int i = 0; i < len; i += groupSize) {

			int start = i;
			int end = Math.min(i + groupSize - 1, len - 1);
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;

			}

		}
		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int groupSize = 3;
		System.out.println("Print Before Reversing The Array in Group ");
		System.out.println("group Size is :" + groupSize);

		printArray(arr);
		arr = reverseInGroups(arr, groupSize);
		System.out.println("Print After Reversing The Array in Group");
		printArray(arr);
		
		//--------------  out Put ---------------------
		/*
		
		Print Before Reversing The Array in Group 
		group Size is :3
		1 2 3 4 5 6 7 8 
		Print After Reversing The Array in Group
		3 2 1 6 5 4 8 7
		
		*/
		
		
		
	}

	public static void printArray(int values[]) {
		for (int value : values) {
			System.out.print(value + " ");

		}
		System.out.println();

	}

}

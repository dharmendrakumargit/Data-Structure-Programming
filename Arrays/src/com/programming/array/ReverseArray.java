package com.programming.array;

// Author Dharmendra Kumar 
// 19 July 2020

public class ReverseArray {

	public static int[] reverseArray(int arr[]) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;

	}

	public static void main(String[] args) {

		int arr[] = { 4, 8, 2, 12, 5, 1, 7, 6 };
		System.out.println("Print Before Reversing The Array");
		printArray(arr);
		arr = reverseArray(arr);
		System.out.println("Print After Reversing The Array");
		printArray(arr);
		//--------------  out Put ---------------------
		/*
		
		
		Print Before Reversing The Array
		4 8 2 12 5 1 7 6 
		Print After Reversing The Array
		6 7 1 5 12 2 8 4  
		
		*/
		
		//------------------------------------------------

	}

	public static void printArray(int values[]) {
		for (int value : values) {
			System.out.print(value + " ");

		}
		System.out.println();

	}

}

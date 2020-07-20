package com.programming.array;

//Author @ Dharmendra Kumar 20 july 2020

public class ConvertArrayIntoZigZag {

	public static int[] zigZagArray(int arr[]) {

		int i = 0;
		int len = arr.length;
		boolean flag = false;
		while (i < len - 1) {

			if (arr[i] > arr[i + 1] && flag == false) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			if (arr[i] < arr[i + 1] && flag == true) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
			i++;

			flag = !flag;
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };

		int arrtemp[] = zigZagArray(arr);

		for (int ar : arrtemp) {
			System.out.print(ar + " ");

		}
		// OUT PUT IS BELOW ..
		// 3 7 4 8 2 6 1 
		// Below is ZigZag Representation
		
	//	     7     8     6
	//	  3 / \ 4 /  \ 2 / \ 1
		
		   

	}

}

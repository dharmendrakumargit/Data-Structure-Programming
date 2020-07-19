package com.programming.array;

import java.util.Arrays;

// Author @ Dharmendra  Kumar 19 July 2020
// Description of the Problem is at bottom .
public class ChocolateDistributionProblem {

	public static int getMinimumDiff(int arr[], int noOfStudent) {

		// m=no of Student
		// n= no of packet

		int m = noOfStudent;
		int n = arr.length;
		// Each Student should have minimum one packet so
		if (n < m) {
			return -1;
		}
		if (n == 0 || m == 0) {
			return 0;
		}
		Arrays.sort(arr);
		printArray(arr);

		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i < n - (m - 1); i++) {

			int diff = arr[i + m - 1] - arr[i];
			if (diff < minDiff) {
				minDiff = diff;
			}
		}

		return minDiff;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };

		int m = 7; // Number of students

		int n = arr.length;
		System.out.println("Minimum difference is " + getMinimumDiff(arr, m));

	}

	public static void printArray(int arr[]) {
		System.out.println("Sorted Array ");

		for (int ar : arr) {
			System.out.print(ar + " ");

		}
		System.out.println();
	}

	public static void descriptionOfTheProblem() {

		// Given an array of n integers where each value represents number of chocolates
		// in a packet.
		// Each packet can have variable number of chocolates. There are m students, the
		// task is to distribute chocolate packets such that:
		// 1) Each student gets one packet.
		// 2) The difference between the number of chocolates in packet with maximum
		// chocolates and packet with minimum chocolates given to the students is
		// minimum.

		// =============== OUT PUT is below .

		// Sorted Array
		// 2 4 7 9 12 23 25 28 30 30 40 41 42 43 44 48 50
		// Minimum difference is 10

	}

}

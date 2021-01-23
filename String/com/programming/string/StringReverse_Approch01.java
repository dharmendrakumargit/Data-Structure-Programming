package com.programming.string;
/* Author Dharmendra Kumar 
23 Jan 2021

How to reverse a String in java? 
Can you write a program without using any java inbuilt methods? 
---------------------------------------------------------------
Approch01 using   For Loop */

public class StringReverse_Approch01 {

	public static void main(String[] args) {
		String str = "Rajesh";
		System.out.println("Origional String is :->" + str);
		System.out.println("Reversed  String is :->" + reverseString(str));
	}

	public static String reverseString(String str) {
		int len = str.length() - 1;
		String rev = "";

		for (int i = len; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
}

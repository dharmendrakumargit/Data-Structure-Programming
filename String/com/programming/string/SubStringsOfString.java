package com.programming.string;

/* Author Dharmendra Kumar 
   19  Feb 2021

   Find all substrings of a given String in java
*/
public class SubStringsOfString {
	
	public static void main(String[] args) {
		String str = "Dharmendra";
		getAllSubString(str);
	}

	public static void getAllSubString(String str) {
		int count = 0;
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				System.out.println(str.substring(i, j));
				count++;
			}
		}
		
		System.out.println("Possible SubString Count :" + count);
	}

	
	
}

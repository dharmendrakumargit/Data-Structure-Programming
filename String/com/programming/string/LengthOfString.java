package com.programming.string;
/* Author Dharmendra Kumar 
20  Feb 2021

Find length of string without inbuild method
*/

public class LengthOfString {

	public static void main(String as[]) {
		String str = "Dharmendra";
		System.out.println(getLengthOfString(str));
		System.out.println(getLengthOfStringWithoutInbuildmethod(str));
	}

	public static int getLengthOfString(String str) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}
		} catch (Exception e) {
		}

		return i;
	}
	
	public static int getLengthOfStringWithoutInbuildmethod(String str) {
		int count = 0;
		char ch[] = str.toCharArray();
		for (char c : ch) {
			count++;
		}
		return count;
	}

}

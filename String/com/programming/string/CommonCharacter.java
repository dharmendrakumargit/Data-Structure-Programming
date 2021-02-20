package com.programming.string;
/* Author Dharmendra Kumar 
20  Feb 2021

Get common character from two diffrent java string object ?

*/
public class CommonCharacter {

	public static void main(String[] args) {
		String str1 = "Software";
		String str2 = "Hardware";
		System.out.println(getCommonCharacter(str1, str2));
	}
	
	
	public static String getCommonCharacter(String str1, String str2) {

		char ch[] = str1.toCharArray();
		String common = "";
		for (char c : ch) {

			int index = str2.indexOf(c);
			if (index > -1) { // or (index != -1)
				common += c;
			}

		}
		return common;

	}
	

}

package com.programming.string;

/* Author Dharmendra Kumar 
   20  Feb 2021

   Write Java Program to find  two Strings are Anagram ?
 
   Two string are anagrams if they have same characters but in different order. 
   For example: Angel and Angle are anagrams
*/

public class AnagramCheck {

	public static void main(String[] args) {

		String str = "Hindi";
		String anagram = "indiH";
		System.out.println(isAnagram(str, anagram));

	}

	public static boolean isAnagram(String str, String anagram) {

		if (str.length() != anagram.length()) {
			return false;
		}

		char chr[] = str.toCharArray();

		for (char c : chr) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}

		return anagram.isEmpty();
	}
}

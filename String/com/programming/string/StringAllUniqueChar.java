package com.programming.string;

/* Author Dharmendra Kumar 
22  Feb 2021

How to check if String has all unique characters in java
*/

import java.util.HashSet;
import java.util.Set;

public class StringAllUniqueChar {

	public static void main(String[] args) {
		String str = "MahesH";
		System.out.println(hasAllUniqueChar(str));
		System.out.println(hasAllUniqueChar_(str));
	}
	
	// Approach 1
	public static boolean hasAllUniqueChar(String str) {

		char ch[] = str.toCharArray();

		for (char c : ch) {
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				return false;
			}
		}
		return true;
	}
	
	// Approach 2
	// If Hashset's add method return false,that means it is already present in HashSet
	public static boolean hasAllUniqueChar_(String str) {

		char ch[] = str.toCharArray();
		Set<Character> s = new HashSet<>();
		for (char c : ch) {
			if (!s.add(c)) {
				return false;
			}
		}

		return true;
	}

}

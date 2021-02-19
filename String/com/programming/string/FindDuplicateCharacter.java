package com.programming.string;

import java.util.HashMap;
import java.util.Map;

/* Author Dharmendra Kumar 
   20  Feb 2021

   Java Program to find duplicate Characters in a String
*/

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str = "AAABBC";
		findDuplicateCharacter(str);
	}

	public static void findDuplicateCharacter(String str) {
		char ch[] = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		for (char c : ch) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Character c : hm.keySet()) {
			if (hm.get(c) > 1) {
				System.out.println("Duplicate Character :" + c + "  is Having Count of :" + hm.get(c));
			}

		}

	}

}

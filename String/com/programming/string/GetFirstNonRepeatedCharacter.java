package com.programming.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Author Dharmendra Kumar 
   22  Feb 2021

   java program to find first non repeated character in a string
*/

public class GetFirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "dharmendra";
		System.out.println(getFirstNonRepeatedCharacterFromString(str));
		System.out.println(getFirstNonRepeatedCharacterFromString_(str));

	}

	// Approach 1
	public static Character getFirstNonRepeatedCharacterFromString(String str) {
		char ch[] = str.toCharArray();

		for (char c : ch) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				return c;
			}
		}

		return null;
	}

	// Approach 2
	public static Character getFirstNonRepeatedCharacterFromString_(String str) {
		char ch[] = str.toCharArray();
		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		// ----------
		for (Map.Entry<Character, Integer> map : hm.entrySet()) {
			if (map.getValue() == 1) {
				return map.getKey();
			}
		}

		return null;
	}

}

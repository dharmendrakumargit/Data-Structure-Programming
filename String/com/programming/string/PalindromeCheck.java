package com.programming.string;

/* Author Dharmendra Kumar 
   20  Feb 2021

   Write a program in java to check whether given String is Palindrome or Not  ?

*/
public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {
		String strRev = new StringBuffer(str).reverse().toString();
		if (strRev.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}

}

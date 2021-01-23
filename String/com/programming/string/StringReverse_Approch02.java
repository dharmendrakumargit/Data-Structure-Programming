package com.programming.string;
/* Author Dharmendra Kumar 
   23 Jan 2021

  How to reverse a String in java? 
  Can you write a program without using any java inbuilt methods? 
  ---------------------------------------------------------------
  Approch02 using  half For Loop*/
		
public class StringReverse_Approch02 {

	public static void main(String[] args) {
      String str="Rajesh";
      System.out.println("Origional String is :->"+str );
      System.out.println("Reversed  String is :->"+reverseString(str));
	}
public static String reverseString(String str) {
	
	char ch[]=str.toCharArray();
	int start=0;
	int end=ch.length-1;
	while (start < end) {
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		start++;
		end--;
	}
	   return String.valueOf(ch);
   }
}

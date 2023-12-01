package com.masai;

public class Reverse_String {
public static void main(String[] args) {
	String input = "fehmida";
	String reverseString = "";
	
	for(int i= input.length()-1;i>=0;i--) {
		reverseString+=input.charAt(i);
	}
	
	System.out.println(reverseString);
	
}
}

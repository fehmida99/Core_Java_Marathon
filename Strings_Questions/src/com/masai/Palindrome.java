package com.masai;

public class Palindrome {
public static void main(String[] args) {
	String input = "fehmida";
	String revString = "";
	
	for(int i=input.length()-1;i>=0;i--) {
		revString+=input.charAt(i);
		
	}
//	System.out.println(revString);
	
	if(input.equals(revString)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not a Palindrome");
	}
	
	
}
}

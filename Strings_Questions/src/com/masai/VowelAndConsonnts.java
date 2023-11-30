package com.masai;

public class VowelAndConsonnts {
public static void main(String[] args) {
	
	int vowelCount=0;
	int c_count =0;
	
	
	
	String input = "fehmida";
	for(int i=0;i<input.length();i++){
		if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' 
				|| input.charAt(i)=='o' || input.charAt(i)=='u') {
			vowelCount++;
			System.out.print("Vowels count : " + input.charAt(i)+" ");
		}else {
			c_count++;
			System.out.print("Consonant count : " + input.charAt(i)+" ");
		}
	}
	
//	System.out.println("Vowels count :" + vowelCount);
//	System.out.println("Consonant count :" + c_count);
	
	
	
	
}
}

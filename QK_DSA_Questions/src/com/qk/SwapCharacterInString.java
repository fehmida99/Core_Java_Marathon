package com.qk;

public class SwapCharacterInString {
	public static void main(String[] args) {
		String s = "hina";
		
		//Strings are immutable so convert it into array 
		char[] str = s.toCharArray();
		
		//swapping
		char temp = str[0];
		str[0]=str[str.length-1];
		str[str.length-1] = temp;
		
		//print
		System.out.println(str);
		
		
		
		
		
	}
}

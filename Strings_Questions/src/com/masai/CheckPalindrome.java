package com.masai;

public class CheckPalindrome {
public static void main(String[] args) {
	String str = "madam";
	String revStr = "";
	
	for(int i=str.length()-1;i>=0;i--) {
		revStr+=str.charAt(i);
				
	}
//	System.out.println(revStr);
	
	
	if(str.equals(revStr)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
}
}













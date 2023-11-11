package com.qk;
/*Swap Strings:
Create a Java program to swap the values of two String variables.*/
public class SwapStrings {
public static void main(String[] args) {
	
	String str1 = "fehmida";
	String str2 = "hina";
	
	
	String temp = str1;
	       str1 = str2;    //str1 = hina
	       str2 = temp;     //str2 = fehmida
	
	System.out.println("After Swapping : "+"Str1 = "+str1+" , Str2 = "+str2);
	
}
}

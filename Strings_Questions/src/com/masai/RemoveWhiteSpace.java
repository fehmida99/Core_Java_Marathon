package com.masai;

public class RemoveWhiteSpace {
public static void main(String[] args) {
	String str = "    Fehmida   In   The     Kitchen";
	
	str = str.replaceAll("\\s", "");
	System.out.println(str);
	
}
}

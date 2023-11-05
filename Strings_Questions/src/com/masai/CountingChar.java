package com.masai;
//Write a Java program to count the total number of characters present in a string.

//we dont have to count the space so we have to apply if conditon.

public class CountingChar {
	public static void main(String[] args) {
		String str = "fehmida in the kitchen";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!= ' ') {
				count++;
			}

		}

		System.out.println("Total number of characters in the string is : " + count);

	}

}

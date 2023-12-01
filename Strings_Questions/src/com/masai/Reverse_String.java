package com.masai;

public class Reverse_String {
	public static void main(String[] args) {

		String input = "fehmida";
		String revString = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			revString += input.charAt(i);

		}
        System.out.println("Original String is : "+ input);
        System.out.println();
		System.out.println("reverse string  is : " + revString);

	}
}



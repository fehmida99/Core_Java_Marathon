package com.masai;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		
		int VowelCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
		    || str.charAt(i) == 'o'|| str.charAt(i) == 'u' || str.charAt(i) == 'A' 
		    || str.charAt(i) == 'E' || str.charAt(i) == 'I' 
		    || str.charAt(i) == 'O'|| str.charAt(i) == 'U') {
				VowelCount++;
			}
		}
        System.out.println("Vowel count in the string : "+VowelCount);
	}
}

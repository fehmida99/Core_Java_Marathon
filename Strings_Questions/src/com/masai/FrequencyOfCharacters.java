package com.masai;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to determine the frequency of characters in the String.

public class FrequencyOfCharacters {

	public static void printfreq(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) != 0) {
				System.out.print(str.charAt(i));
				System.out.print(map.get(str.charAt(i)) + "  ");
				map.put(str.charAt(i), 0);
			}
		}

	}

	public static void main(String[] args) {

		String str = "fehmidainthekitchen";

		printfreq(str);
		
//		int a = 0; int b = 4; 
//		for (a = 0; a < b; a++) {
//			 System.out.println("Hello World");
//			 b++;
//		}
//		


	}
}








 










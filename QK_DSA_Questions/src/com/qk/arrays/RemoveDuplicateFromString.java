package com.qk.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {

		String s = "heena";
		char[] arr = s.toCharArray();

		Set<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		System.out.println(set);

		System.out.println();
		
		// 1st method by using stringBuilder
		// To convert set to string
		StringBuilder sb = new StringBuilder();
		for (Character ch : set) {
			sb.append(ch);
		}

		System.out.println(sb);
		System.out.println();

		// 2nd method to print by using enhance forloop
		for (Character c : set) {
			System.out.print(c + " ");
		}

	}
}

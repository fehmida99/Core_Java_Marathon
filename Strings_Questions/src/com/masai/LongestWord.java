package com.masai;

public class LongestWord {
	public static void main(String[] args) {

		String str = "My Youtube Channel Name Is FehmidaInTheKitchen";

		System.out.println("Longest word length in the given sentence is : "+LongestWordLength(str));

	}

	public static int LongestWordLength(String str) {
		String[] words = str.split(" ");
		int length = 0;

		for (String val : words) {
			if (length < val.length()) {
				length = val.length();
			}
		}
		return length;
	}

}

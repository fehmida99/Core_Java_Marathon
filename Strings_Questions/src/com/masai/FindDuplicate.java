package com.masai;

import java.util.Arrays;

public class FindDuplicate {
	public static void main(String[] args) {
		String str = "hinaa Shaikh";
		printDuplicates(str);
	}


	public static void printDuplicates(String str) {


		int size = str.length();

		// Sorting the string
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String sortedStr = new String(ch);
        //	System.out.println(ch);

		// Loop through the sorted string to find duplicates
		for (int i = 0; i < size; i++) {
			int count = 1;

			// Counting the occurrences of each character
			while (i < size - 1 && sortedStr.charAt(i) == sortedStr.charAt(i + 1)) {
					count++;
					i++;
				}

			// Printing the duplicate character and its count
			if (count > 1) {
				System.out.println(sortedStr.charAt(i) + ", count = " + count);
			}

		}

	}

}

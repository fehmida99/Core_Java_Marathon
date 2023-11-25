package com.qk.Hashmap.Questions;

import java.util.HashMap;
import java.util.Map;

public class CreateHashmap {
	public static void main(String[] args) {
		//Java Program to Create HashMap with Element Frequencies.

		int arr[] = { 6, 7, 8, 9, 2, 3, 4, 4, 1, 6, 5, 0 };

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i]) == false) {
				hm.put(arr[i], 1);
			} else {
				int oldfreq = hm.get(arr[i]);
				int newfreq = oldfreq + 1;
				hm.put(arr[i], newfreq);
			}
		}
		System.out.println(hm);
		System.out.println();

		System.out.println("Keys with Frequency 1 : ");
		for (Map.Entry<Integer, Integer> en : hm.entrySet()) {
			if (en.getValue() == 1) {
				System.out.print(en.getKey() + " ");
			}
		}

	}
}

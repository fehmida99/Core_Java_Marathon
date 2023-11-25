package com.qk.Hashmap.Questions;

import java.util.HashMap;
import java.util.Map;
//Java Program to Create HashMap with Element Frequencies.

public class CreateHashmapWithFrequncy {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i]) == false) {
				hm.put(arr[i], 1);
			} else {
				int oldFrequency = hm.get(arr[i]);
				int newFrequency = oldFrequency + 1;
				hm.put(arr[i], newFrequency);
			}
		}

		System.out.println(hm);
		System.out.println();

		System.out.println("Keys with Frequency 1:");

		// System.out.println(hm.entrySet());

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}

		}

		/*
		 * Map.Entry<Integer, Integer>: Map.Entry is an interface in Java that
		 * represents a key-value pair in a map. In this case, Map.Entry<Integer,
		 * Integer> is specifying that the keys are of type Integer and the values are
		 * also of type Integer. By using Map.Entry, you can iterate over the entries of
		 * a map and access both the key and the value for each entry.
		 * 
		 * hm.entrySet(): entrySet() is a method of the Map interface that returns a Set
		 * containing all the entries (key-value pairs) of the map. So, hm.entrySet()
		 * gives you a set of entries for the hm (HashMap) map.
		 * 
		 */

	}

}

package com.qk.arrays;

import java.util.HashSet;

public class PrintUniquebyUsingHashSet {
	public static void main(String[] args) {

		
		int arr[] = { 1, 3, 4, 4, 2, 5, 5, 6, 6, 7 };
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!hs.contains(arr[i])) {
				hs.add(arr[i]);
			}
		}
	//	System.out.println(hs);

		
		for(Integer val : hs) {
			System.out.println(val);
		}
		
		
		
		
	}
}

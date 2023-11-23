package com.qk.arrays;

import java.util.HashMap;

/*By storing all the elements to the hashmap's key.
By using nested loop.
By using sorting.
By using hashing.*/

public class PrintUniqueElement {
public static void main(String[] args) {
	
	int arr[] = {10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6};
	
	HashMap<Integer, Integer> hm = new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
		hm.put(arr[i], i);
	}
	
	System.out.println(hm.keySet());
	
	
	
	
	
	
}
}

package com.qk.arrays;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	
	int arr[] = {3,3,4,4,6,5,1,1,2,2,6,8,9,0};

	Set<Integer> set = new LinkedHashSet<>();
	
	
	for(Integer val : arr) {
		set.add(val);
	}
	
	System.out.println(set);
	
	
}
}

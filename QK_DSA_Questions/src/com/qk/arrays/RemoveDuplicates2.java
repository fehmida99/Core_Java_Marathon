package com.qk.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates2 {
public static void main(String[] args) {
	
	List li = Arrays.asList(1,1,2,2,3,4,4,5,5,6,6,7,5,4,32,2);
	
	Set<Integer> set = new LinkedHashSet<>(li);
	
	for(Integer val :set) {
		System.out.print(val+" ");
	}
	
	
}
}

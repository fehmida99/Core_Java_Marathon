package com.masai;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a function to remove duplicates from an array of integers.

public class RemoveDuplicates {
public static void main(String[] args) {
	
	List li = Arrays.asList(4,5,6,6,4,5,8,9,21,1);
	
	Set<Integer> set = new HashSet<>(li);
	for(int val : set) {
		System.out.print(val+" ");
	}
	
	
}
}

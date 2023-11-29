package com.masai;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
public static void main(String[] args) {
	
	String input ="aaliya";
	
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for(char c : input.toCharArray()) {
		set.add(c);
	}
	
    //System.out.println(set);
	
	//here we get unique char in the form of array
	//we have to convert it back to string.
	
	
	StringBuilder sb = new StringBuilder();
	for(char c : set) {
		sb.append(c);
	}
	
	System.out.println("Original String : "+input);
	System.out.println("String after removing Duplicates : "+sb);
	
	
	
	
	
	
}
}

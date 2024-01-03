package com.masai;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInString {
public static void main(String[] args) {
	
	String str = "heena";
	char[] arr = str.toCharArray();
	
	
	Set<Character> set = new LinkedHashSet<>();
	for(int i=0;i<arr.length;i++) {
		set.add(arr[i]);
	}
	
	System.out.println(set);
	
	StringBuilder sb = new StringBuilder();
	for(Character c : set) {
		sb.append(c);
	}
	System.out.println(sb);
}
}

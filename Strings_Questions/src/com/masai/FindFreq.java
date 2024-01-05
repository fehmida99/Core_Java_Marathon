package com.masai;

import java.util.HashMap;
import java.util.Map;

public class FindFreq {
public static void main(String[] args) {
	String s = "fehmida shaikh";
	FindFrequency(s);
}

public static void FindFrequency(String s) {
	Map<Character, Integer> map = new HashMap<>();
	for(int i=0;i<s.length();i++) {
		if(map.containsKey(s.charAt(i))){
			map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}else {
			map.put(s.charAt(i), 1);
		}
		
	}
	
	for(int i=0;i<s.length();i++) {
		if(map.get(s.charAt(i))!=0) {
			System.out.print(s.charAt(i)+" = ");
			
			System.out.print(map.get(s.charAt(i))+", ");
		}
	}
	
	
	
}
}

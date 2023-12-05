package com.masai;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagram(char[] str1,char[] str2) {
		
		int n1 = str1.length;
		int n2 = str2.length;
		
		if(n1!=n2) {
			return false;
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<n1;i++) {
			if(str1[i]==str2[i]) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	
	
public static void main(String[] args) {
	
	char[] str1 = {'s','i','l','e','n','t'};
	char[] str2 = {'l','i','s','t','e','n'};
	
	if(anagram(str1,str2)) {
		 System.out.println("The two strings are anagram of each other");
	}else {
		System.out.println("The two strings are NOT anagram of each other");
	}
	
	
}
}

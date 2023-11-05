package com.masai;

import java.util.Scanner;
//Write a Java program to count the number of words present in a string.

public class CountWords {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the sentence: ");
	String str = sc.nextLine();
	
	//1st method :
//	String[] strArray = str.split(" ");
//	System.out.println("Total words in the the string is : "+strArray.length);

	
	//2nd Method
//	int count =0;
//	for(String word :str.split(" ")) {
//		count++;	
//	}
//	
//	System.out.println("Total words in the the string is : "+count);
	
	
	//3rd Method
	int count =1;
	for(int i=0;i<str.length();i++) {
		if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
			count++;
		}
	}
	System.out.println("Total words in the the string is : "+count);
	
	
}
}

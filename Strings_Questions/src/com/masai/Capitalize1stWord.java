package com.masai;
//Write a function to capitalize the first letter of each word in a sentence.

public class Capitalize1stWord {
public static void main(String[] args) {
//	String str = "java is a programming language";
//	String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
//	System.out.println(cap);
	
	
	//using inbuilt function:
	/*String str = "i have learned something new today";
    String[] arr = str.split(" ");

    for (int i = 0; i < arr.length; i++) {
        arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
    }

    String str2 = String.join(" ", arr);
    System.out.println(str2);*/
	
    
    
    String str = "fehmida in the kitchen";
    String[] arr = str.split(" ");
    
    for(int i=0;i<arr.length;i++) {
    	arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
    	    	
    }
    
    String str2 = String.join(" ", arr);
    System.out.println(str2);
    
    
    
    
    
    
	
}
}

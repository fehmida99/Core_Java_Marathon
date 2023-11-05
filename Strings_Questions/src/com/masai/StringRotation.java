package com.masai;

// Let’s write a Java program to determine whether one string is the rotation of another string.

public class StringRotation {
	public static boolean checkRotation(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
//concatenating the string str1 with itself and storing the result in a                   new string variable named str3
	   String str3 = str1+str1;
	   
		if(str3.contains(str2)) 
		return true;
		
		else
			
		return false;
		
		
	}
	
	
	
public static void main(String[] args) {
	String str1 = "fehmida";
	String str2 = "ahmidfe";
	
	System.out.println("Checking if a string is rotation of another");
	System.out.println();
	 if (checkRotation(str1, str2)) {  
         System.out.println("Yes.... " + str2 + " is rotation of " + str1);  
     } else {  
         System.out.println("No.... " + str2 + " is not rotation of " + str1);  
     }  
			
}





}

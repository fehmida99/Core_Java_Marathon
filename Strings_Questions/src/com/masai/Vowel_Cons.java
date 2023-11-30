package com.masai;

public class Vowel_Cons {
public static void main(String[] args) {
	 StringBuilder vowels = new StringBuilder();
	 StringBuilder cons = new StringBuilder();
	
	
	String input = "fehmida";
	
	for(int i=0;i<input.length();i++){
		char ch= input.charAt(i);
		if(ch =='a' || ch =='e' || ch =='i' 
				|| ch =='o' || ch =='u') {
			
			vowels.append(ch+" ");
		}else {
			cons.append(ch+ " ");
			
//			System.out.print("Consonant count : " + input.charAt(i)+" ");
		}
	}
	System.out.println("vowel count : "+ vowels);
	System.out.println("Consonant count : "+ cons);
	
	
	
	
}


}

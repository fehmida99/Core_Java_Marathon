package com.masai;

public class OccurrencesOfWordInString {
	public static void main(String[] args) {
		String str = "My name is fehmida shaikh and i am a java developer. java is a robust language.";
		String word = "java";
		System.out.println(OccouranceOfWord(str, word));

	}

	public static int OccouranceOfWord(String str, String word) {
		String s[] = str.split(" ");

		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (word.equals(s[i])) {
				count++;
			}
		}

		return count;

	}

}

package com.masai;

import java.util.Scanner;

public class Happy_Bdayyyy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.print("Enter your birthdate (MM/DD): ");
		String birthdate = sc.nextLine();

		System.out.println("\nHappy Birthday, " + name + "!");
		System.out.println("Wishing you a fantastic day on " + birthdate + "!"
		+"May Allah fullfill all your best wishes.....BE HAPPY AND KEEP SMILING ALWAYS");

	}
}

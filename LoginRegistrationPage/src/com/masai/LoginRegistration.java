package com.masai;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginRegistration {

	 private static Map<String, String> userDatabase = new HashMap<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Register");
	            System.out.println("2. Login");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    registerUser(scanner);
	                    break;
	                case 2:
	                    loginUser(scanner);
	                    break;
	                case 3:
	                    System.out.println("Exiting program. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	            }
	        }
	    }

	    private static void registerUser(Scanner scanner) {
	        System.out.print("Enter username: ");
	        String username = scanner.next();
	        System.out.print("Enter password: ");
	        String password = scanner.next();

	        if (userDatabase.containsKey(username)) {
	            System.out.println("Username already exists. Please choose a different username.");
	        } else {
	            userDatabase.put(username, password);
	            System.out.println("Registration successful! You can now login.");
	        }
	    }

	    private static void loginUser(Scanner scanner) {
	        System.out.print("Enter username: ");
	        String username = scanner.next();
	        System.out.print("Enter password: ");
	        String password = scanner.next();

	        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
	            System.out.println("Login successful! Welcome, " + username + "!");
	        } else {
	            System.out.println("Invalid username or password. Please try again.");
	        }
	    }
}

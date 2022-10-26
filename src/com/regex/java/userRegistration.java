package com.regex.java;

import java.util.*;
import java.util.regex.Pattern;

public class userRegistration {

	public boolean userName(String regex, String input) {
		return Pattern.compile(regex).matcher(input).matches();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = "^[A-Z]{1}[a-z]{2,}$";		// Nadeem = true,	// nadeem = false
		String inputfirstName = sc.next();
		
		System.out.println("Enter Last Name: ");
		String lastName = "^[A-Z]{1}[a-z]{2,}$";		//Akhtar = true,	//akhtar = false
		String inputLastName = sc.next();
		
		userRegistration ur = new userRegistration();
		System.out.println(ur.userName(firstName, inputfirstName)); 
		System.out.println(ur.userName(lastName, inputLastName));
															

	}

}

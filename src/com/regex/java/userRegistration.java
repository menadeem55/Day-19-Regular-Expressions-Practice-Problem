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
		
		System.out.println("Enter Your E-mail id: ");	//abc.xyz@bl.co.in - Email has 3 mandatory
		String email = "^[a-zA-Z]+([_+-.][a-zA-Z])+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";
		String inputEmailId = sc.next();
		
		userRegistration ur = new userRegistration();
		System.out.println(ur.userName(firstName, inputfirstName)); 
		System.out.println(ur.userName(lastName, inputLastName));
		System.out.println(ur.userName(email, inputEmailId));
															

	}

}

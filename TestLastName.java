package com.regex;

import java.util.Scanner;

public class TestLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z = new Scanner(System.in);
		System.out.println("Plese Enter LastName Starting With Caps");
		String name = z.nextLine();
		LAST_NAME lastname = new LAST_NAME(name);
		lastname.LastName();
		
		
		
				
	
				z.close();
		
			
	}
}


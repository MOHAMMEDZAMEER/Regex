package com.regex;

	import java.util.Scanner;

	public class TestEmail {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print(" Please enter the email: ");
			String name = scan.nextLine();
			
			Email email= new Email();
			email.firstName(name);
			scan.close();
		}
	}

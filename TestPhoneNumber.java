package com.regex;

import java.util.Scanner;

public class TestPhoneNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the phone number: ");
		String phone = scan.nextLine();
		
		PhoneNumber number = new PhoneNumber();
		number.phoneNumber(phone);
		scan.close();
	}
}
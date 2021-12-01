package com.regex;

import java.util.Scanner;

public class TestPW1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the password: ");
		String password = scan.nextLine();
		
		PassWord1 pw = new PassWord1();
		pw.password(password);
		scan.close();
	}
}


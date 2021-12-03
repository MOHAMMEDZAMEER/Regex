package com.regex;



import java.util.Scanner;

public class TestPW2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please enter the password: ");
		String password = scan.nextLine();
		
		Paasword2 pw2 = new Paasword2();
		pw2.password2(password);
		scan.close();
	}
}
package com.regex;

import java.util.Scanner;

public class TestPW4 {
	public static void main(String[] args) {
	Scanner z=new Scanner(System.in);
	
	System.out.println("Enter the Password");
	String Password=z.nextLine();
	
	PassWord4 pw4=new PassWord4();
	pw4.password(Password);
	z.close();
	
	
	}
}

package com.regex;

import java.util.Scanner;

public class TestEmail1 {
public static void main(String[] args) {
	Scanner z = new Scanner(System.in);
	System.out.println("Enter Emails to check");
	String Email = z.nextLine();
	
	Email1 em= new Email1();
	em.email(Email);
	z.close();
}
}
package com.regex;

import java.util.Scanner;

public class TestPW3 {

	public static void main(String[] args) {
		
		Scanner z=new Scanner(System.in);
		System.out.println("Enter Valid Password contains one Upper Case");
		String password=z.nextLine();
		
		PassWord3 pw3=new PassWord3();
		pw3.password(password);
		z.close();
		
		
	}
	
}

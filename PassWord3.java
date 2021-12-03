package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWord3 {

	final String NAME="^[A-Z][a-z]{3,}(\\s)[A-Z][a-z]{3,}$";
	final String EMAIL="^[A-Za-z0-9+_-]+([.][A-Za-z0-9+_-])+*@[A-Za-z0-9+_-]+([.][A-Za-z0-9+_-])+$"; 
	final String PHONE = "^[0-9]{1,3}[\\S][0-9]{10}$";
	final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";


	public void firstName(String name) {
		
		Pattern pattern = Pattern.compile(NAME);
		Matcher match = pattern.matcher(name);
		System.out.println(match.matches());
	}
	
	public void email(String email) {
		
		Pattern pattern = Pattern.compile(EMAIL);
		Matcher match = pattern.matcher(email);
		System.out.println(match.matches());
	}
	
	public void phoneNumber(String phone) {
		
		Pattern pattern = Pattern.compile(PHONE);
		Matcher match = pattern.matcher(phone);
		System.out.println(match.matches());
	}
	
	public void password(String password) {
		
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher match = pattern.matcher(password);
		System.out.println(match.matches());
		
	}
}

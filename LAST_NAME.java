package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LAST_NAME {

	
	
	 final String LastName= "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";

	
	public  LAST_NAME (String name) {
		 Pattern pattern = Pattern.compile(LastName);
		 Matcher match = pattern.matcher(name);
		 System.out.println(match.matches());
	 }

	public void LastName() {
		// TODO Auto-generated method stub
		
	}
	
	 
	 
}
			 
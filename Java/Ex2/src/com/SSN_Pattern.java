package com;

import java.util.stream.Stream;

public class SSN_Pattern {

	public static void main(String[] args) {

		String ssn = "142-12-3434";

		boolean isValid = true;
		if (ssn.length() == 11) {
			for (int i = 0; i < 11; i++) {
				if (i == 3 || i == 6) {
					if (ssn.charAt(i) != '-') {
						isValid = false;
						break;
					}
				} else {
					if ("1234567890".indexOf(ssn.charAt(i)) == -1) {
						isValid = false;
						break;
					}
				}
			}
		}

		if (isValid)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		
		//----------------------------------------
		
		
		String pattern="\\D{3}-\\D{2}-\\D{4}";
		boolean b="ass-as-sddf".matches(pattern);
		System.out.println(b);
		
		//-------------------------------------
		
		
		

	}

}

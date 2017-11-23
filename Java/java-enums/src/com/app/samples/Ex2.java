package com.app.samples;

// benifits of Enum

/* 
 * 1. Enum is Type Safe
 * 2. Enum  in java are rerence types
 * 3. specify values of enum-constants creation time
 * 4. by default 'static' & 'final'
 * 5. can be used as an arg on swith-stametents
 * 
 */

enum Gender {
	MALE, FEMALE
}

class Employee {
	Gender gender;
}

public class Ex2 {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.gender = Gender.MALE;

		// -----------------------------------

		Gender key = Gender.MALE;

		switch (key) {
		case MALE:

			break;
		case FEMALE:

			break;
		default:
			break;
		}

		// -------------------------------------

		System.out.println(Gender.MALE == Gender.FEMALE);
		System.out.println(Gender.MALE.equals(Gender.FEMALE));

	}

}

package com.app.before;

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setGender(Gender.MALE);
		employee.setGender("men");// loosing type-safety

	}

}

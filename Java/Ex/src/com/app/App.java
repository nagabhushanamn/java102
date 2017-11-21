package com.app;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.app.lib.ItemsLib;
import com.app.model.Employee;
import com.app.model.Gender;

public class App {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Nag", 1000.00, LocalDate.of(1983, 10, 15), Gender.MALE);
		Employee employee2 = new Employee("Indu", 2000.00, LocalDate.of(1988, 01, 16), Gender.FEMALE);
		Employee employee3 = new Employee("Ria", 3000.00, LocalDate.of(2015, 05, 30), Gender.FEMALE);
		Employee employee4 = new Employee("other", 1000.00, LocalDate.of(1983, 10, 15), Gender.MALE);

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);

		// ---------------------------------------------------

		ItemsLib lib = new ItemsLib();
		
		//lib.forEach(employees,System.out::println);
		//lib.forEach(employees, item -> System.out.println(item.getName()));
		//lib.forEach(employees, item -> System.out.println(item.getName() + " " + item.getGender()));

		//List<Employee> femaleEmps=lib.filter(employees, item->item.getGender().equals(Gender.FEMALE));
		//lib.forEach(femaleEmps, System.out::println);
		
		List<String> empNames=lib.map(employees, item->item.getName());
		lib.forEach(empNames, System.out::println);
		
	}

}

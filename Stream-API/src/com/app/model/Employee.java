package com.app.model;

import java.time.LocalDate;

public class Employee {

	private String name;
	private double salary;
	private LocalDate dob;
	private Gender gender;

	public Employee(String name, double salary, LocalDate dob, Gender gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.gender = gender;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dob=" + dob + ", gender=" + gender + "]";
	}

}

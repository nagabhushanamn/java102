package com.model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Person implements Comparable<Person> {

	public static enum Gender {
		MALE, FEMALE
	};

	private long id;
	private String name;
	private Gender gender;
	private LocalDate dob;
	private double income;

	public Person(long id, String name, Gender gender, LocalDate dob,
			double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.income = income;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public boolean isFemale() {
		if (this.gender == Gender.FEMALE)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", dob=" + dob + ", income=" + income + "]";
	}

	public static List<Person> persons() {

		Person p1 = new Person(1, "A", Gender.MALE, LocalDate.of(1970,
				Month.MAY, 24), 6000);
		Person p2 = new Person(2, "B", Gender.FEMALE, LocalDate.of(1960,
				Month.MAY, 24), 4000);
		Person p3 = new Person(3, "C", Gender.MALE, LocalDate.of(1870,
				Month.JANUARY, 24), 5000);
		Person p4 = new Person(3, "D", Gender.MALE, LocalDate.of(1870,
				Month.JANUARY, 24), 5000);
		Person p5 = new Person(5, "E", Gender.MALE, LocalDate.of(1980,
				Month.MAY, 23), 0.0);
		Person p6 = new Person(6, "F", Gender.FEMALE, LocalDate.of(1940,
				Month.DECEMBER, 24), 6000);

		List<Person> persons = Arrays.asList(p5, p2, p3, p4, p1, p6);

		return persons;

	}
	
	@Override
	public int compareTo(Person arg0) {
		return this.getName().compareTo(arg0.getName());
	}

}

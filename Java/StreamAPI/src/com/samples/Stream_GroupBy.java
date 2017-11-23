package com.samples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.model.Person;
import com.model.Person.Gender;

public class Stream_GroupBy {
	
	public static void main(String[] args) {
		
		// person by Gender
		
		Map<Person.Gender, List<Person>> personsByGender=
				Person.persons()
				.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		System.out.println(personsByGender);
		
		personsByGender.get(Gender.MALE).forEach(System.out::println);
		System.out.println();
		personsByGender.get(Gender.FEMALE).forEach(System.out::println);
				
		
	 //--------------------------------------------------------------
		
		System.out.println();
		
		Map<Person.Gender,Long> countByGender=
				Person.persons()
				.stream()
				.collect(Collectors.groupingBy(Person::getGender,Collectors.counting()));
				
		System.out.println(countByGender);
		
	}

}

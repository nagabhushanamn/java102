package com.samples;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.model.Person;

public class Stream_Wrappers {

	public static void main(String[] args) {

		List<String> names = Person
				.persons()
				.stream()
				.map(Person::getName)
				.sorted((n1,n2)->n2.compareTo(n1))
				.collect(
						Collectors.collectingAndThen(Collectors.toList(),
								result -> Collections.unmodifiableList(result)));

		//names.add("UnknonName");

		System.out.println(names);
		
		

		
	}

}

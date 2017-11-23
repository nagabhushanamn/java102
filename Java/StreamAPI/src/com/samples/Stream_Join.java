package com.samples;

import java.util.stream.Collectors;

import com.model.Person;

public class Stream_Join {

	public static void main(String[] args) {
		
		String names=Person.persons()
				.stream()
				.map(Person::getName)
				.sorted()
				//.collect(Collectors.joining());
				//.collect(Collectors.joining(", "));
				.collect(Collectors.joining(", ","Hello ",". GoodBye"));
		
		
		System.out.println(names);
		
		
	}
	
}


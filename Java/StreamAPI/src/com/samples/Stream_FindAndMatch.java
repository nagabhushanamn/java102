package com.samples;

import java.util.Optional;

import com.model.Person;

public class Stream_FindAndMatch {
	
	public static void main(String[] args) {
		
		
		boolean allFemales=Person.persons()
				.stream()
				//.allMatch(Person::isFemale);
				.anyMatch(p->p.getGender()==Person.Gender.FEMALE);
		
		System.out.println(allFemales);
		
		//--------------------------------------------------
		
		boolean anyOneBornIn1980=Person.persons()
				.stream()
				.anyMatch(p->p.getDob().getYear()==1980);
		
		System.out.println(anyOneBornIn1980);
		
		//-----------------------------------------------------------
		
		
		Optional<Person> anyFemale=
		 Person.persons()
		.stream()
		.filter(Person::isFemale)
		.findFirst();
		
		
		if(anyFemale.isPresent()){
			System.out.println(anyFemale.get());
		}
		
		
		
	}

}

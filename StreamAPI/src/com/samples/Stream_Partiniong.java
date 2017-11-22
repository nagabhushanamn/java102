package com.samples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.model.Person;

public class Stream_Partiniong {
	
	public static void main(String[] args) {
		
		
		Map<Boolean, List<Person>> partitionBySalary=
				Person.persons()
				.stream()
				.collect(Collectors.partitioningBy(p->p.getIncome()>4000));
		
		
		System.out.println(partitionBySalary);
		
	}

}

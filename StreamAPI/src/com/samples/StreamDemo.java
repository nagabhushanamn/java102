package com.samples;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Person;
import com.model.Person.Gender;

public class StreamDemo {

	public static void main(String[] args) {

		// collecting summary statistics.

		DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
		
//		stats.accept(3000);
//		stats.accept(3000);
//		stats.accept(2000);
//		stats.accept(3000);
//		stats.accept(8000);
//		stats.accept(6000);
//		
//		System.out.println(stats.getCount());
//		System.out.println(stats.getMax());
//		System.out.println(stats.getMin());
//		System.out.println(stats.getMax());
//		System.out.println(stats.getAverage());
//		System.out.println(stats.getSum());
//		
		//------------------------------------------------------
		
		 stats=Person.persons()
		.stream()
		//.map(Person::getIncome)
		//.collect(DoubleSummaryStatistics::new,DoubleSummaryStatistics::accept,DoubleSummaryStatistics::combine);;
		.collect(Collectors.summarizingDouble(Person::getIncome));
		
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getMax());
		System.out.println(stats.getAverage());
		System.out.println(stats.getSum());
		
		//---------------------------------------------------------------------

		
//		Map<Person.Gender, String> genderToNamesMap=
//				Person.persons()
//				.stream()
//				.collect(Collectors.toMap(Person::getGender,
//						                  Person::getName,
//			                              (oldValue,newValue)->String.join(", ", oldValue,newValue)));
//		
//		System.out.println(genderToNamesMap);
		
		
		
//		Map<Person.Gender, Long> countByGender=
//				Person.persons()
//				.stream()
//				.collect(Collectors.toMap(Person::getGender,
//						                  p->1L,
//						                  (oldValue,newValue)->++oldValue));
//		
//		System.out.println(countByGender);
		
		
		
		Map<Person.Gender, Person> highIncomeByGender=
				Person.persons()
				.stream()
				.collect(Collectors.toMap(Person::getGender,
						                  Function.identity(),
						                  (oldPerson,newPerson)->newPerson.getIncome()>oldPerson.getIncome()?newPerson:oldPerson));
		
		System.out.println(highIncomeByGender);
		
		
		
	}

}

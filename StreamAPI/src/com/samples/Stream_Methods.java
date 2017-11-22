package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.model.Person;

/*
 * Stream methods
 * 
 *   Intermediate
 * 
 *    1. distinct
 *    2. filter
 *    3. flatMap   ( 1- M )
 *    4. limit
 *    5. map       ( 1 - 1 )
 *    6. peek  
 *    7. skip 
 *    8. sorted
 *  
 *    Terminal
 *       
 *    9. allMatch
 *    10. anyMatch
 *    11. findAny
 *    12. findFirst
 *    13. noneMatch
 *    14. forEach
 *    15. reduce
 *    16. collect
 *    
 *    
 *    
 * 
 * 
 */

public class Stream_Methods {

	public static void main(String[] args) {

		// debugging stream
		//
		// Stream
		// .of(1,1,2,3,5,2,3,4,5,6,7,8,9,10)
		// //.limit(5)
		// .peek(e->System.out.println("Takingg integer "+e))
		// .filter(n->n%2 == 1)
		// .peek(e->System.out.println("Filtered integer "+e))
		// .map(n->n*n)
		// .peek(e->System.out.println("Mapped integer "+e))
		// //.reduce(0, Integer::sum)
		// .limit(5)
		// .forEach(System.out::println);
		// ;

		// System.out.println(sum);

		// Person.persons()
		// .stream()
		// .filter(Person::isFemale)
		// .forEach(System.out::println);
		//
		// System.out.println();
		//
		// Person.persons()
		// .stream()
		// .filter(Person::isFemale)
		// .forEach(p->p.setIncome(p.getIncome()*5));
		//
		//
		// Person.persons()
		// .stream()
		// .forEach(System.out::println);

		//

		// ----------------------------------------

		// map and flatMap

		// IntStream.rangeClosed(1, 5)
		// .map(n->n*n)
		// .forEach(System.out::println);

		// flatMap
		//
		// Stream.of(1,2,3)
		// .map(n->Stream.of(n,n*n))
		// .forEach(System.out::println);
		//
		// System.out.println();
		//
		// Stream.of(1,2,3)
		// .flatMap(n->Stream.of(n,n*n))
		// .forEach(System.out::println);

		//
//		String[] menu = { "veg1,veg2", "non1,non2" };
//		Stream<String> menuStream = Stream.of(menu);
//		//
//		menuStream.flatMap(item -> Stream.of(item.split(","))).forEach(System.out::println);
		//
		// -----------------------------------------------------

		// (a,b,c)->map-->x,y,z
		// (a,b,c)->flatMap -> a1,a2,b,c1,c2

		// ------------------------------------------------

//		 long c = Person.persons()
//				        .stream()
//				        .filter(Person::isFemale)
//				        .count();
//		 System.out.println(c);

		// ---------------------------------------------------------

		// reduce
		//
		// List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		
		 //int sum=0;// acc var
//		 for(Integer item:numbers){
//		 // accumulator
//			 sum=sum+item;
//		 }
//		 System.out.println(sum);

		// ----------------------------------
//
//		 sum=numbers.stream()
//		 .reduce(0, (acc,next)->{
//			 return acc+next;
//		 });
//		 
//		 System.out.println(sum);

		// --------------------------------------------------------

//		 double total=Person.persons()
//		 .stream()
//		 .map(Person::getIncome)
//		 .reduce(0.0,Double::sum);
//		
//		 System.out.println(total);
		

		// ------------------------------------------------------------------

		// reduce(init,accumulator)
		// reduce(init,accumulator,combiner);
		// reduce(init,BiFunction,BiOperator);

		// double sum=Person.persons()
		// .stream()
		// .reduce(0.0,(partialSum,person)->partialSum+person.getIncome()+1000,Double::sum);
		// //.reduce(0.0,(partialSum,person)->partialSum+person.getIncome(),Double::sum);
		//
		// System.out.println(sum);

		// --------------------------------------------------------------------------
//		
//		 Optional<Double> optional =
//		 Person.persons()
//		 .stream()
//		 .map(Person::getIncome)
//		 .reduce(Double::max);
//		
//		 if(optional.isPresent()){
//		 System.out.println(optional.get());
//		 }else{
//		 System.out.println("No salry Exist");
//		 }

		// -------------------------------------------------------------------

//		 OptionalDouble income = Person.persons()
//				 .stream()
//				 .mapToDouble(Person::getIncome)
//				 .max();
//		
//		 if (income.isPresent()) {
//		 System.out.println(income.getAsDouble());
//		 }

		// -----------------------------------------------------------------------

		// Collecting Data using Collectors

		
//		 List<Person> femalePersons=Person.persons()
//		 .stream()
//		 .filter(Person::isFemale)
//		 //.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
//		 .collect(Collectors.toList());
//		//
//		 femalePersons.forEach(System.out::println);
//
//		 SortedSet<Person> persons = Person.persons()
//		  .stream()
//		  //.map(Person::getName)
//		   .sorted((o1,o2)->{return o1.getName().compareTo(o2.getName());})
//		   .collect(Collectors.toCollection(TreeSet::new));
//		//
//		//
//		 persons.forEach(System.out::println);
	}

}

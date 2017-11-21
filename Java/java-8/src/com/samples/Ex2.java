package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Why We Need Lambda Expressions in Java

public class Ex2 {

	public static void main(String[] args) {
		
		
		

		// 1. External vs. internal iteration
		// ==========================================================

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// -------------------------------------------------------------

		// way-1
		for (int number : numbers) {
			System.out.println(number);
		}

		// --------------------------------------------------------------

		// way-2
		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer value) {
				System.out.println(value);
			}
		});

		// --------------------------------------------------------------
		// way-3
		numbers.forEach((Integer value) -> System.out.println(value));
		// or
		numbers.forEach(value -> System.out.println(value));
		// or
		numbers.forEach(System.out::println);
		// --------------------------------------------------------------

		
		
		
		
		
		// 2. Passing behaviors, not only values
		// ========================================

		//List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6);

		sumAll(numbers, n -> true);
		sumAll(numbers, n -> n % 2 == 0);
		sumAll(numbers, n -> n > 3);
		
		// --------------------------------------------------------------
		
		
		
		

		// 3. Efficiency through laziness
		// ========================================
		
		
		for (int number : numbers) {
		    if (number % 2 == 0) {
		        int n2 = number * 2;
		        if (n2 > 5) {
		            System.out.println(n2);
		            break;
		        }
		    }
		}
		
		// --------------------------------------------------------------
		// or
		
		List<Integer> l1 = new ArrayList<Integer>();
		for (int n : numbers) {
		    if (isEven(n)) l1.add(n);
		}

		List<Integer> l2 = new ArrayList<Integer>();
		for (int n : l1) {
		    l2.add(doubleIt(n));
		}

		List<Integer> l3 = new ArrayList<Integer>();
		for (int n : l2) {
		    if (isGreaterThan5(n)) l3.add(n);
		}

		System.out.println(l3.get(0));
		
		// --------------------------------------------------------------
		// or
		
		System.out.println(
			    numbers.stream()
			            .filter(Ex2::isEven)
			            .map(Ex2::doubleIt)
			            .filter(Ex2::isGreaterThan5)
			            .findFirst()
			);
		
		// --------------------------------------------------------------
		
		
		//4. 	The loan pattern
		//===========================================
		
		
		
		
//		Resource resource = new Resource();
//		resource.operate();
//		resource.dispose();
		
		// --------------------------------------------------------------
		
		// or
		
//		Resource resource = new Resource();
//		try {
//		    resource.operate();
//		} finally {
//		    resource.dispose();
//		}
		
		// --------------------------------------------------------------
		
		// or
		
		withResource(resource -> resource.operate());
		

	}
	

	public static int sumAll(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static int sumAllEven(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				total += number;
			}
		}
		return total;
	}

	// .....................
	

	public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
		int total = 0;
		for (int number : numbers) {
			if (p.test(number)) {
				total += number;
			}
		}
		return total;
	}
	
	
	
	//------------------------------------------------------
	
	public static boolean isEven(int number) {
	    return number % 2 == 0;
	}

	public static int doubleIt(int number) {
	    return number * 2;
	}

	public static boolean isGreaterThan5(int number) {
	    return number > 5;
	}
	
	//----------------------------------------------------
	
	public static void withResource(Consumer<Resource> consumer) {
	    Resource resource = new Resource();
	    try {
	        consumer.accept(resource);
	    } finally {
	        resource.dispose();
	    }
	}
	
	

}



class Resource {

    public Resource() {
        System.out.println("Opening resource");
    }

    public void operate() {
        System.out.println("Operating on resource");
    }

    public void dispose() {
        System.out.println("Disposing resource");
    }
}

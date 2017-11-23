package com.app.samples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Owner {
	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Car {

	String model;
	String color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

}

public class Ex {

	public static void main(String[] args) {

		// String s1 = "sapient";
		// String s2 = "sapient";
		//
		// System.out.println(s1 == s2); // true
		// System.out.println(s1.equals(s2));
		//
		// String s3 = new String("sapient");
		// String s4 = new String("sapient");
		//
		// System.out.println(s3 == s4); // false
		// System.out.println(s3.equals(s4));

		// ------------------------------------

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Ria");

		Car car1 = new Car("bmw", "black");
		Car car2 = new Car("audi", "white");
		//
		// System.out.println(car1 == car2);
		// System.out.println(car1.equals(car2));

		// --------------------------------------
		//
		// Set<Car> cars = new HashSet<>();
		// cars.add(car1);
		// cars.add(car2);
		//
		// System.out.println(car1.hashCode());
		// System.out.println(car2.hashCode());
		//
		// System.out.println(car1.equals(car2));
		//
		// System.out.println(cars.size());

		// ---------------------------------------

		Map<Owner, Car> data = new HashMap<>();
		data.put(owner1, car1);
		data.put(owner2, car2);

		// -------------------------------------

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter owner name ?");
		String name = scanner.nextLine();

		Owner key = new Owner(name);

		Car car = data.get(key);
		if (car != null) {
			System.out.println(car.model + "-" + car.color);
		} else {
			System.out.println("dream it");
		}

		scanner.close();

	}

}

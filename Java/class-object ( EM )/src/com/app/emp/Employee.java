// package dec (1)
package com.app.emp;

// import statements
import java.lang.*;

// public Type ( class | interface | enum | Annotation )
public class Employee {

	// state ==> variables

	// a. class var
	public final static String COMP_NAME = "sapient";
	public static String tnrName;

	// b. instance var
	public int id;
	public String name;

	// constructor(s)
	public Employee() {
	}

	// behav ==> methods

	// a. class methods
	public static void doTrain() {
		System.out.println("Employee :: doTrain");
	}

	// b. instance methods
	public void listenAndWork() {
		System.out.println("emp :: listenAndWork");
	}

	// inner-class

	// blocks ( static | instance block )

}

// default types
class Abc{
	
}

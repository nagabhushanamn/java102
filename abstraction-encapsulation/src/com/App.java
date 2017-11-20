package com;

import com.car.Car;
import com.emp.Employee;
import com.wheel.ceat.CEATWheel;
import com.wheel.mrf.MRFWheel;

import p1.A;
import p1.B;
import p1.C;
import p2.D;
import p2.E;

public class App {

	public static void main(String[] args) {

		// A a = new A();
		// a.aObjMethod();

		// B b = new B();
		// b.bObjMethod();

		// C c = new C();
		// c.cObjMethod();

		// D d = new D();
		// d.dObjMethod();

		// E e = new E();
		// e.eObjMethod();

		// -----------------------------------

		// Employee employee = new Employee(123);
		// employee.setSalary(1000.00);
		//
		// System.out.println(employee.getBonus());

		// -----------------------------------

		MRFWheel mrfWheel = new MRFWheel();
		Car car = new Car();
		car.setWheel(mrfWheel);
		car.move();
		System.out.println("-------------------");
		CEATWheel ceatWheel = new CEATWheel();
		car.setWheel(ceatWheel);
		car.move();

	}

}

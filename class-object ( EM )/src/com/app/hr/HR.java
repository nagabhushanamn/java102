package com.app.hr;

import com.app.emp.Employee;

public class HR {

	public static void manageEmployees() {

		// create employees

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "A";
		
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "B";

		// do Training & getWork
		Employee.doTrain();

		e1.listenAndWork();
		e2.listenAndWork();

	}

}

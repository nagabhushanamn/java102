package com.ex.single;

import java.util.Scanner;

/*
 *  tasks
 *  ------
 *  
 *   - get name from console & greet him/her
 *   - print number from 1 to 100
 * 
 */

class Task1 {
	public void doTask1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ur Name?");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + " GM");
		scanner.close();
	}
}

class Task2 {
	public void doTask2() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}

public class Single_Thread_App {

	public static void main(String[] args) {

		String name = Thread.currentThread().getName();

		// step-1 : task1
		Task1 task1 = new Task1();
		task1.doTask1();
		System.out.println("-------------------------");
		// step-2 : task2
		Task2 task2 = new Task2();
		task2.doTask2();
		System.out.println("-------------------------");
		// step-n

	}

}

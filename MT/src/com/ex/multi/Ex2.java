package com.ex.multi;

public class Ex2 {

	public static void main(String[] args) {

		Runnable task = () -> {
			// ==> RUNNING
			String name = Thread.currentThread().getName(); 
			for (int i = 0; i < 500; i++) {
				System.out.println(name + "-->" + i);
				// ==> NOT-READY-TO-RUN | READY-TO-RUN
			}
			// ==> DEAD
		};
		// -------------------------------------------
		Thread thread1 = new Thread(task, "A"); // New
		Thread thread2 = new Thread(task, "B");
		Thread thread3 = new Thread(task, "C");
		// --------------------------------------------
		thread1.start(); // NEW ==> READY-TO-RUN
		thread2.start();
		thread3.start();

	}

}

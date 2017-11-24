package com.ex.multi;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Im running in thread");
	}
}

class TaskThread extends Thread {
	@Override
	public void run() {
		System.out.println("Im thread");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		// way-1
		// -----------------------------------
		Task task = new Task(); // task

		Thread thread1 = new Thread(task);
		thread1.start();

		// --------------------------------
		// way-2
		TaskThread taskThread = new TaskThread(); // task + thread
		taskThread.start();

		// ---------------------------------

	}

}

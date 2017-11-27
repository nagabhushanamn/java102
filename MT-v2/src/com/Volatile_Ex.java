package com;

public class Volatile_Ex {

	private static volatile int MY_INT = 0; // shared value..

	// private Object lock = new Object();

	public static void main(String[] args) {

		Runnable changeMaker = () -> {
			int local_value = MY_INT;
			while (MY_INT < 5) {
				System.out.printf("Incrementing MY_INT to %d \n", local_value + 1);
				MY_INT = ++local_value;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable changeListener = () -> {
			int local_value = MY_INT;
			while (local_value < 5) {
				// System.out.println(local_value);
				// System.out.println(MY_INT);
				if (local_value != MY_INT) {
					System.out.printf("Got Change for MY_INT : %d \n", MY_INT);
					local_value = MY_INT;
				}
			}
		};

		// -------------------------------------------------

		Thread changeMakerThread = new Thread(changeMaker);
		Thread changeListenerThread = new Thread(changeListener);

		changeMakerThread.start();
		changeListenerThread.start();

	}

}

package com.ex.multi;

import java.util.concurrent.TimeUnit;

import org.w3c.dom.css.Counter;

public class Ex11 {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class Counter {

		private int totalCount;

		// public static int getTotal() {
		// return totalCount;
		// }

		public synchronized void incTotalCount() throws InterruptedException {
			// synchronized (this) {
			printMessage("started inc..");
			TimeUnit.SECONDS.sleep(2);
			totalCount++;
			printMessage("finsished inc..");
			// }
		}

		public synchronized void decTotalCount() throws InterruptedException {
			// synchronized (this) {
			printMessage("started dec..");
			TimeUnit.SECONDS.sleep(2);
			totalCount--;
			printMessage("finsished dec..");
			// }
		}

	}

	public static void main(String[] args) {

		Counter counter1 = new Counter();
		Counter counter2 = new Counter();

		Runnable inc = () -> {
			try {
				counter1.incTotalCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable dec = () -> {
			try {
				counter2.decTotalCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		// -------------------------------------

		Thread thread1 = new Thread(inc, "boy-1");
		Thread thread2 = new Thread(inc, "boy-2");
		Thread thread3 = new Thread(dec, "girl-1");
		Thread thread4 = new Thread(dec, "girl-2");

		// -----------------------------------------

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// -------------------------------------------s

	}

}

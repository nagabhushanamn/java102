package com.ex.multi;

import java.util.concurrent.TimeUnit;

import org.w3c.dom.css.Counter;

public class Ex12 {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class Counter {

		private Object key1 = new Object();
		private Object key2 = new Object();

		private int totalCount1;
		private int totalCount2;

		// public static int getTotal() {
		// return totalCount;
		// }

		public void incTotalCount1() throws InterruptedException {
			synchronized (key1) {
				printMessage("started inc1..");
				TimeUnit.SECONDS.sleep(2);
				totalCount1++;
				printMessage("finsished inc1..");
			}
		}

		public void incTotalCount2() throws InterruptedException {
			synchronized (key2) {
				printMessage("started inc2..");
				TimeUnit.SECONDS.sleep(2);
				totalCount2++;
				printMessage("finsished inc2..");
			}
		}

	}

	public static void main(String[] args) {

		Counter counter = new Counter();

		Runnable inc = () -> {
			try {
				counter.incTotalCount1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable dec = () -> {
			try {
				counter.incTotalCount2();
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

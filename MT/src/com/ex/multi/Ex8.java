package com.ex.multi;

import java.util.concurrent.TimeUnit;

public class Ex8 {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class Building {
		public static synchronized void room1() {
			printMessage("in room-1");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printMessage("exiting room1");
		}

		public static synchronized void room2() {
			printMessage("in room-2");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			printMessage("exiting room2");
		}

	}

	public static void main(String[] args) {

		Runnable r1 = () -> {
			Building.room1();
		};
		Runnable r2 = () -> {
			Building.room2();
		};

		// ---------------------------------------------
		Thread thread1 = new Thread(r1, "Aneesh");
		Thread thread2 = new Thread(r2, "Mridul");
		thread1.start();
		thread2.start();

	}

}

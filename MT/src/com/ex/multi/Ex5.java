package com.ex.multi;

import java.util.concurrent.TimeUnit;

public class Ex5 {

	public static void printThreadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s:  %s%n", threadName, message);
	}

	private static class ProgramLoop implements Runnable {
		@Override
		public void run() {
			// try {
			for (int i = 0; i < 1000; i++) {
				// TimeUnit.SECONDS.sleep(1);
				printThreadMessage(String.valueOf(i));

				if (Thread.interrupted()) {
					return;
				}

			}
			// } catch (InterruptedException e) {
			// printThreadMessage("i wasnt done");
			// }
		}
	}

	public static void main(String[] args) throws InterruptedException {

		printThreadMessage("starting ProgramLoop thread");

		Thread thread = new Thread(new ProgramLoop(), "PL");
		thread.start();
		//
		printThreadMessage("Waiting for ProgramLoop thread to finish");

		while (thread.isAlive()) {
			// printThreadMessage("Still waiting..");
			thread.join(10); // main waits PL thread to die
			if (thread.isAlive()) {
				// printThreadMessage("interupting...");
				thread.interrupt(); //
			}
		}
		printThreadMessage("Finally..we r moving to next topic");

	}

}

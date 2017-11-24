package com.ex.multi;

import java.util.concurrent.TimeUnit;

// Join

public class Ex4 {

	public static void main(String[] args) {

		Runnable doProgram = () -> {

			System.out.println("working on program..");
			System.out.println("got doubt..");

			Thread tnrThread = new Thread(() -> {
				System.out.println("finding solution");
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("this is solution to ur doubt");
			});
			tnrThread.start();

			try {
				tnrThread.join(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Thanks flor slolution");

		};

		Thread participantThread = new Thread(doProgram);
		participantThread.start();

	}

}

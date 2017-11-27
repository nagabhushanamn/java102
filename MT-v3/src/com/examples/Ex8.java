package com.examples;

import java.util.concurrent.CyclicBarrier;

public class Ex8 {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

		NewTechLead techLead1 = new NewTechLead(cyclicBarrier, "Rashid");
		NewTechLead techLead2 = new NewTechLead(cyclicBarrier, "Doe TL");
		NewTechLead techLead3 = new NewTechLead(cyclicBarrier, "Mark TL");

		techLead1.start();
		techLead2.start();
		techLead3.start();

		System.out.println("No work for HR manager");

	}

}

class NewTechLead extends Thread {

	CyclicBarrier cyclicBarrier;

	public NewTechLead(CyclicBarrier cyclicBarrier, String name) {
		super(name);
		this.cyclicBarrier = cyclicBarrier;

	}

	@Override
	public void run() {

		try {
			String name = Thread.currentThread().getName();
			if (name.equals("Rashid")) {
				Thread.sleep(10000);
			} else {
				Thread.sleep(3000);
			}
			System.out.println(Thread.currentThread().getName() + " recruited developer");
			System.out.println(Thread.currentThread().getName() + " waiting for others to complete....");
			cyclicBarrier.await();
			System.out.println("All finished recruiting, " + Thread.currentThread().getName()
					+ " gives offer letter to candidate");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.comp.service;

public class TicketBookingService {

	TxrService txrService = new TxrService();

	public void bookTicket() {
		try {
			boolean b = txrService.txr(5000.00, "23456789", "345678");
			System.out.println(b ? "success" : "Failed");
		} catch (AccountBalanceException e) {
			System.out.println("Ex-message : " + e.getMessage());
		}
	}

}

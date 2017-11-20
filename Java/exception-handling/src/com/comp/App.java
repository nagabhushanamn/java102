package com.comp;

import com.comp.service.TicketBookingService;

public class App {

	public static void main(String[] args) {

		TicketBookingService bookingService = new TicketBookingService();
		bookingService.bookTicket();

	}

}

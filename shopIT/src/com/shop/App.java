package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billComp = new BillingImpl();

		// use
		String[] cart = { "3457", "456789" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);

		// destroy
		// ..

	}

}

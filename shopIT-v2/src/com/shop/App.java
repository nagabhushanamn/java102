package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// some-one
		
		// init
		PriceMatrix v1=new PriceMatrixImpl_v1();
		PriceMatrix v2=new PriceMatrixImpl_v2();
		Billing billComp = new BillingImpl(v1);

		// use
		String[] cart = { "3457", "456789" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);

		// destroy
		// ..

	}

}

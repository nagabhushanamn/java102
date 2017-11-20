package com.comp.service;

public class AccountBalanceException extends Exception {

	double balance;

	public AccountBalanceException(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		return "No enough balance ! , balance - " + balance;
	}

}

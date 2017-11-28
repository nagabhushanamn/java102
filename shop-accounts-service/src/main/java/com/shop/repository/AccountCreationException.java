package com.shop.repository;

public class AccountCreationException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Account Creation Failed";
	}
}

package com.shop.repository;

public class AccountNotFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Account Not Found";
	}
}

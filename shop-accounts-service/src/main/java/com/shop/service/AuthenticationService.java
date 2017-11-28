package com.shop.service;

import com.shop.model.Account;

public interface AuthenticationService {
	void createNewAccount(Account account);
	boolean authenticate(String username, String password);
}

package com.shop.service;

import com.shop.model.Account;
import com.shop.repository.AccountNotFoundException;
import com.shop.repository.AccountRepository;

public class AuthenticationServiceImpl implements AuthenticationService {

	private AccountRepository accountRepository;

	public AuthenticationServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public void createNewAccount(Account account) {
		accountRepository.save(account);
	}

	@Override
	public boolean authenticate(String username, String password) {
		boolean isAuthenticated = false;
		try {
			Account account = accountRepository.find(username);
			if (password.equals(account.getPassword())) {
				isAuthenticated = true;
			}
		} catch (AccountNotFoundException e) {
			throw e;
		}
		return isAuthenticated;
	}

}

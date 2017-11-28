package com.shop.service;

import java.util.HashMap;
import java.util.Map;

import com.shop.model.Account;
import com.shop.repository.AccountNotFoundException;
import com.shop.repository.AccountRepository;

public class StubAccountRepository implements AccountRepository {

	private static Map<String, Account> db = new HashMap<>();

	static {
		Account account = new Account();
		account.setEmail("nag@email.com");
		account.setPassword("secret");
		db.put(account.getEmail(), account);
	}

	@Override
	public void save(Account account) {
		db.put(account.getEmail(), account);
	}

	@Override
	public Account find(String email) {
		Account account = db.get(email);
		if (account == null) {
			throw new AccountNotFoundException();
		}
		return account;
	}

	@Override
	public void update(Account account) {
	}

	@Override
	public void delete(String email) {

	}

}

package com.shop.repository;

import com.shop.model.Account;

public interface AccountRepository {

	void save(Account account);

	Account find(String email);

	void update(Account account);

	void delete(String email);

}

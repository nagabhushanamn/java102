package com.shop.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import com.shop.model.Account;
import com.shop.repository.AccountNotFoundException;
import com.shop.repository.AccountRepository;

public class AuthenticatorServiceTest {

	AccountRepository repository = null;
	AuthenticationService service = null;

	public AuthenticatorServiceTest() {
		System.out.println("Constructor");
	}

	@Before
	public void setUp() {
		System.out.println("Before");
		// repository = new StubAccountRepository();
		repository = Mockito.mock(AccountRepository.class);
		service = new AuthenticationServiceImpl(repository);
	}

	@After
	public void tearDown() {
		System.out.println("After");
	}

	@Test
	public void createNewAccount() {
		System.out.println("createNewAccount");
		// Arrange
		Account account = new Account();
		account.setEmail("ria@gmail.com");
		account.setPassword("daddy");

		Mockito.doNothing().when(repository).save(account);
		Mockito.when(repository.find("ria@gmail.com")).thenReturn(account);

		// Act
		service.createNewAccount(account);
		// Assert
		Account acc = repository.find("ria@gmail.com");
		assertNotNull(acc);
	}

	@Ignore
	@Test
	public void authenticateSuccess() {
		System.out.println("authenticateSuccess");
		// Act
		boolean b = service.authenticate("nag@email.com", "secret");
		// Assert
		assertTrue(b);
	}

	@Ignore
	@Test
	public void authenticateFail() {
		System.out.println("authenticateFail");
		// Act
		boolean b = service.authenticate("nag@email.com", "invalid");
		// Assert
		assertFalse(b);
	}

	@Ignore
	@Test(expected = AccountNotFoundException.class)
	public void authentNotExist() {
		System.out.println("authentNotExist");
		service.authenticate("sapient@email.com", "invalid");
	}

}

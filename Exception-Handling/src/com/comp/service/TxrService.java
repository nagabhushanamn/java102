package com.comp.service;

public class TxrService {

	public boolean txr(double amount, String fromAccNum, String toAccNum)throws AccountBalanceException {

		// Load from & to account(s)

		double fromAccBalance = 1000.00;
		if(!(fromAccBalance>=amount)) throw new AccountBalanceException(fromAccBalance);

		// debit & credit

		// update accounts
		
		return true;
	}

}

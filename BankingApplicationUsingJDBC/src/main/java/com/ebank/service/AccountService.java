package com.ebank.service;

import com.ebank.bean.Account;
import com.ebank.dao.AccountDao;

public class AccountService {

	AccountDao ad = new AccountDao();

	public String createAccount(Account account) {
		if (account.getAmount() < 1000) {
			return "To create account, you need min 1000";
		} else if (ad.createAccount(account) > 0) {
			return "Account created successfully";
		} else {
			return "Account wasn't created";
		}
	}

	public String withdraw(Account account) {
		float balance = ad.findBalance(account.getAccno());
		if (balance == -1) {
			return "Account doesn't exist";
		} else {
			if (balance > account.getAmount()) {

				if (ad.withdraw(account) > 0) {
					return "Withdrawn successfully";
				} else {
					return "Wasn't withdrawn";
				}

			} else {
				return "Insufficient amount! you can't withdraw";
			}
		}
	}

	public String deposit(Account account) {
		if (ad.deposit(account) > 0) {
			return "Deposited amount successfully";
		} else {
			return "Amount wasn't deposited";
		}
	}

	public String findBalance(int accno) {
		float balance = ad.findBalance(accno);
		if (balance == -1) {
			return "Account doesn't exist";
		} else {
			return "Your balance is " + balance;
		}
	}
}
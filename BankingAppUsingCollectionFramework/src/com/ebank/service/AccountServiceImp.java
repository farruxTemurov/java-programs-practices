package com.ebank.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ebank.bean.Account;

public class AccountServiceImp implements AccountService {

	List<Account> listOfAccounts = new ArrayList<Account>(); // we can store n number of account objects.

	@Override
	public String createAccount(Account account) {
		int flag = 0;
		if (listOfAccounts.size() == 0) {
			listOfAccounts.add(account);
			return "Account created successfully";
		}

		Iterator<Account> li = listOfAccounts.iterator();
		while (li.hasNext()) {
			Account acc = li.next();
			if (acc.getAccno() == account.getAccno()) {
				flag++;
				break;
			}
		}

		if (flag == 0) {
			listOfAccounts.add(account);
			return "Account created successfully";
		} else {
			flag = 0;
			return "Account number must be unique";
		}
	}

	@Override
	public void displayAllAccountDetails() {

		Iterator<Account> li = listOfAccounts.iterator();
		while (li.hasNext()) {
			Account acc = li.next();
			System.out.println(
					"Account Number " + acc.getAccno() + " Name  " + acc.getName() + " Amount " + acc.getAmount());
		}
	}

	@Override
	public String findAccountBalance(int accno) {
		for (Account acc : listOfAccounts) {
			if (acc.getAccno() == accno) {
				return "Account Balance: " + acc.getAmount();
			}
		}
		return "Account not found for account number: " + accno;
	}

	@Override
	public String withdraw(int accno, float amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(int accno, float amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
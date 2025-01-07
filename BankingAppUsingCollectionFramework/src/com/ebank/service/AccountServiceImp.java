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
		// Find the account with the given account number
		for (Account acc : listOfAccounts) {
			if (acc.getAccno() == accno) {
				float currentBalance = acc.getAmount();
				float transactionCharge = 10.0f; // Transaction fee

				// Check if the withdrawal amount + transaction charge is less than or equal to
				// the current balance
				if (amount + transactionCharge <= currentBalance) {
					// Deduct the withdrawal amount and transaction fee from the account balance
					acc.setAmount(currentBalance - (amount + transactionCharge));
					return "Withdrawal successful. New balance: " + acc.getAmount() + " (Transaction charge: "
							+ transactionCharge + ")";
				} else {
					return "Insufficient funds. Transaction failed.";
				}
			}
		}
		return "Account not found for account number: " + accno;
	}

	@Override
	public String deposit(int accno, float amount) {
		for (Account acc : listOfAccounts) {
			if (acc.getAccno() == accno) {
				float currentBalance = acc.getAmount();
				float transactionCharge = 10.0f; // Transaction fee

				// Deposit the amount after deducting the transaction fee
				acc.setAmount(currentBalance + (amount - transactionCharge));

				// Return success message with the updated balance
				return "Deposit successful. New balance: " + acc.getAmount() + " (Transaction charge: "
						+ transactionCharge + ")";
			}
		}
		// If account not found, return error message
		return "Account not found for account number: " + accno;
	}

}
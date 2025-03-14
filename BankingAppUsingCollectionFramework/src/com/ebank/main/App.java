package com.ebank.main;

import java.util.Scanner;

import com.ebank.bean.Account;
import com.ebank.service.AccountService;
import com.ebank.service.AccountServiceImp;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con = "";
		int choice;
		int accno;
		String name;
		float amount;
		AccountService as = new AccountServiceImp();
		String result;
		do {
			System.out.println("1:Create Account, 2: Display all account details, 3: "
					+ "Find account balance, 4: Withdraw, 5: Deposit");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the account number");
				accno = sc.nextInt();
				System.out.println("Enter the name");
				name = sc.next();
				System.out.println("Enter the amount");
				amount = sc.nextFloat();
				Account acc1 = new Account();
				acc1.setAccno(accno);
				acc1.setName(name);
				acc1.setAmount(amount);
				result = as.createAccount(acc1);
				System.out.println(result);
				break;
			case 2:
				as.displayAllAccountDetails();
				break;
			case 3:
				System.out.println("Plz enter your account number ");
				accno = sc.nextInt();
				String balanceResult = as.findAccountBalance(accno); // Get the result from the service
				System.out.println(balanceResult); // Print the result (balance or not found message)
				break;
			case 4:
				System.out.println("Plz enter the account number from which you want to withdraw");
				accno = sc.nextInt();
				System.out.println("Plz enter the amount to withdraw");
				amount = sc.nextFloat();
				String withdrawResult = as.withdraw(accno, amount); // Call the withdraw method
				System.out.println(withdrawResult); // Print the result (success or failure)
				break;
			case 5:
				System.out.println("Plz enter the account number to deposit into");
				accno = sc.nextInt();
				System.out.println("Plz enter the amount to deposit");
				amount = sc.nextFloat();
				String depositResult = as.deposit(accno, amount); // Call the deposit method
				System.out.println(depositResult); // Print the result (success or failure)
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		} while (con.equals("y"));

		System.out.println("Thanks for your visit!");
	}

}
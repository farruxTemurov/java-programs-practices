package com;

import java.util.Date;

class User {
	String name;
	String phone;
	String email;
	char gender;
	Date birthDate;
	String password;

	public User() {
		name = "";
		phone = "NA";
		email = "NA";
		gender = 'M';
		birthDate = new Date();
		password = "password";
	}

	public User(String name, String phone, String email, char gender, Date birthDate, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.password = password;
	}

	public void setUserData(String name, String phone, String email, char gender, Date birthDate, String password) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.password = password;
	}

	public void showUserData() {
		System.out.println("____________________");
		System.out.println(name + " can be called at " + phone + " and emailed at " + email + "; the user's gender is "
				+ gender + " and was born on " + birthDate + ", the password is " + password);
		System.out.println("____________________");
	}

}

public class OOPS {
	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserData("Tim", "+998991234311", "tim@example.com", 'M', new Date(), "password");
		user1.showUserData();

		User user2 = new User();
		user2.setUserData("John", "+9989912309811", "john@example.com", 'M', new Date(), "passwordJ");
		user2.showUserData();

		Products p1 = new Products();
		p1.setProductData("TV", 4.5, "Great TV", 90.9);
		p1.showProductDetails();
	}

}

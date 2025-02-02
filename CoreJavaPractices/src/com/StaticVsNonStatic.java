package com;

class Dish {
	String name;
	int price;
	int quantity;

	// Static attributes belong to class
	static int numberOfDishes = 0;

	public Dish() {
		name = "Dish";
		price = 0;
		quantity = 0;
		numberOfDishes++;
	}

	public Dish(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		numberOfDishes++;
	}

	public void showDish() {
		System.out.println("Dish details: " + name + " " + price + " " + quantity);
	}

	public static void showNumberOfDishes() {
		System.out.println("Number of dishes are " + numberOfDishes);
	}

}

public class StaticVsNonStatic {

	public static void main(String[] args) {
		Dish d1 = new Dish("Salad", 10, 12);
		d1.showDish();
		d1.showNumberOfDishes();
	}

}

package com;

class Product{
	int id;
	String name;
	String description;
	float price;
	String brand;
	
	Product(){
		
	}

	public Product(int id, String name, String description, float price, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}

	void showProduct() {
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.println("name" + name);
		System.out.println("description" + description);
		System.out.println("brand" + brand);
		System.out.println("~~~~~~~~~~~~~~~~");
	}
}

class Shoe extends Product {
	int[] sizes;
	String[] colors;

	Shoe() {

	}

	public Shoe(int id, String name, String description, float price, String brand, int[] sizes, String[] colors) {
		super(id, name, description, price, brand);
		this.sizes = sizes;
		this.colors = colors;
	}

	void showShoe() {
		showProduct();
		System.out.println(sizes);
		System.out.println(colors);
	}

}

public class InheritanceBenefits {

	public static void main(String[] args) {

	}

}

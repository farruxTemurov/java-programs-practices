package com;

public class Product {
	String name;
	double ratings;
	String description;
	double price;

	public Product() {
		super();
		name = "NA";
		ratings = 0.0;
		description = "Product";
		price = 0.0;
	}

	public Product(String name, double ratings, String description, double price) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
	}

	public void setProductData(String name, double ratings, String description, double price) {
		this.name = name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
	}

	public void showProductDetails() {
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("The product is " + name + " and has a rating of " + ratings + " and priced at " + price);
		System.out.println("The product description is: " + description);
		System.out.println("~~~~~~~~~~~~~~~~~");
	}

}

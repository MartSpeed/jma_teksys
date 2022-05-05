package com.perscholas.cafe;

public abstract class Product {

	// ***VARIABLES START***
	private String name;
	private double price;
	private String description;
	private double quantity;
	// ***VARIABLES END***

	// **CONSTRUCTORS START**
	public Product() {
	}

	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	// ***CONSTRUCTORS END***
	// ***GETTERS/SETTERS START***
	// NAME
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		// getters return the value
		return name;
	}

	// PRICE
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		// setters, set themselves to be used
		this.price = price;
	}

	// DESCRIPTION
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// QUANTITY
	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	// ***GETTERS/SETTERS START***

	// calculates the product subtotal for the order
	public double calculateProductTotal(int quantity, double price) {
		return quantity * price;
	}
	
	// create 2 new abstract methods in product
	// abstract
	abstract void addOptions(boolean o1, boolean o2);
	abstract String printOptions(boolean o1, boolean o2);

}

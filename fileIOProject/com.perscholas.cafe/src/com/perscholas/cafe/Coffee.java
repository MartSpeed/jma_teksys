package com.perscholas.cafe;

import java.util.Scanner;

// inherit from Product
public class Coffee extends Product {

	// V
	boolean sugar, milk;

	// C
	public Coffee() {
		// this.milk = false;
		// this.sugar = false;
		super("Coffee", 4.50, "Just a cup of crappy coffee");
	}

	public Coffee(boolean sugar, boolean milk) {
		super("Coffee", 4.50, "Just a cup of crappy coffee");
		this.sugar = sugar;
		this.milk = milk;
	}

	// get/set
	public Boolean getMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public Boolean getSugar() {
		return milk;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	//
	@Override
	public double calculateProductTotal(int quantity, double price) {
		return quantity * price;
	}

	@Override
	void addOptions(boolean o1, boolean o2) {

		// scanner for sugar choice
		Scanner coffeeScanner = new Scanner(System.in);
		System.out.println("Would you like sugar?");

		// do you want sugar?
		String sugar = coffeeScanner.nextLine();
		if (sugar == "Y") {
			o1 = true;
		} else {
			o1 = false;
		}

		// scanner for milk choice
		Scanner coffeeScanner = new Scanner(System.in);
		System.out.println("Would you like milk?");

		// do you want milk?
		String milk = coffeeScanner.nextLine();
		if (milk == "Y") {
			o2 = true;
		} else {
			o2 = false;
		}
	}
	

	@Override
	String printOptions(boolean o1, boolean o2) {
		// TODO Auto-generated method stub
		return null;
	}

}

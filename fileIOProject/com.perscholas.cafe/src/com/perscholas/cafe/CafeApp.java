package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
	// ***METHODS START***
	public static void main(String[] args) {
		// DRIVER CLASS
		// Sales tax
		double salesTax = 3.00d;

		//
		Coffee coffee = new Coffee();
		Espresso espresso = new Espresso();
		Cappuccino cappuccino = new Cappuccino();

		// Product objects to be called and added to ArrayList
		// Product coffee = new Product("Coffee", 4.50, "Just a cup of crappy coffee");
		// Product espresso = new Product("Espresso", 3.50, "Plain espresso");
		// Product cappuccino = new Product("Cappuccino", 5.50, "Espresso and milk
		// foam");

		// create a scanner class to access to the input
		Scanner quantityInput = new Scanner(System.in);

		// ArrayList
		ArrayList<Product> shoppingCart = new ArrayList<Product>();

		// object added to the array list
		shoppingCart.add(coffee);
		shoppingCart.add(espresso);
		shoppingCart.add(cappuccino);

		// subtotal index
		double subtotal = 0;

		// ArrayList foreach loop
		for (Product p : shoppingCart) {
			System.out.format("How many %ss would you like?\n", p.getName());
			int indivQuantity = quantityInput.nextInt();
			subtotal += p.calculateProductTotal(indivQuantity, p.getPrice());
			System.out.format("Item: %-10s Description: %-10s Subtotal: %,.2f\n", p.getName(), p.getDescription(),
					p.calculateProductTotal(indivQuantity, p.getPrice()));

		}
		// close scanner
		quantityInput.close();

		System.out.println("Subtotal: " + subtotal);
		System.out.println("Sales Tax: " + salesTax);
		System.out.println("Total: " + (subtotal + salesTax));
	}
	// ***METHODS END***

}
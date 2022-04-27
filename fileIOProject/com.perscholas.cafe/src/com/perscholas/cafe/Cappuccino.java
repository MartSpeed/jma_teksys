package com.perscholas.cafe;

//inherit from Product
public class Cappuccino extends Product {
	// v
	boolean peppermint, whippedCream;

	// c
	public Cappuccino() {
		// booleans starting in the false value unless purchased to make it true
		//this.peppermint = false;
		//this.whippedCream = false;
		super("Cappuccino", 4.50, "Espresso and milk foam\n");
	}

	public Cappuccino(boolean peppermint, boolean whippedCream) {
		super("Cappuccino", 4.50, "Espresso and milk foam\n");
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	// get/set
	public Boolean getPeppermint() {
		return peppermint;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public Boolean getWhippedCream() {
		return whippedCream;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
	//
	@Override
	public double calculateProductTotal(int quantity, double price) {			
		
		double adderTotal = 0;
		
		if(peppermint = true) {
			adderTotal += 2.00;
		}
		if(peppermint = true) {
			adderTotal += 1.00;
		}
		return quantity * (price + adderTotal);
	}

	@Override
	void addOptions(boolean o1, boolean o2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	String printOptions(boolean o1, boolean o2) {
		// TODO Auto-generated method stub
		return null;
	}
}

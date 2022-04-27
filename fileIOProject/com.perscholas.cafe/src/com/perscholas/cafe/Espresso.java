package com.perscholas.cafe;

//inherit from Product
public class Espresso extends Product{
//v
	boolean extraShot, macchiato;
	
	// c
	public Espresso() {
		//this.extraShot = false;
		//this.macchiato = false;
		super("Espresso", 3.50, "Plain espresso");
	}
	
	public Espresso(boolean extraShot, boolean macchiato) {
		super("Espresso", 3.50, "Plain espresso");
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	// set/get
	public Boolean getMacchiato() {
		return macchiato;
	}
	public void setMilk(boolean macchiato) {
		this.macchiato = macchiato;
	}
	public Boolean getExtraShot() {
		return extraShot;
	}
	public void setSugar(boolean extraShot) {
		this.extraShot = extraShot;
	}

	@Override
	public double calculateProductTotal(int quantity, double price) {			
		
		double adderTotal = 0;
		
		if(extraShot) {
			adderTotal += 2.00;
		}
		if(macchiato) {
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

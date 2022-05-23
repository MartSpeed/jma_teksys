package com.example;

public class Item {
	// FIELDS
	private String itemName, itemDesc;
	private Double itemPrice;
	private Integer quantity, availableQuantity;

	public Item() {
		// initializes the quantity to 1
		quantity = 1;
	}

	public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
		// constructor with args
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
		this.availableQuantity = availableQuantity;
	}	

	// GETTERS/SETTERS START
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	// GETTERS/SETTERS END

	// this translates the data java takes from our fields and output it into a
	// human readable output
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice=" + itemPrice + ", quantity="
				+ quantity + ", availableQuantity=" + availableQuantity + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}

package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	// FIELDS
	// just need to designate the Hashmap name and THEN initialize it
	private HashMap<String, Item> itemCollection;

	// CONSTRUCTORS
	TheSystem() {
		// initializes the itemCollection w/ empty HashMap
		HashMap<String, Item> itemCollection = new HashMap<>();
		// check to see if AppSystem is invoking the constructor
		if (getClass().getSimpleName().equals("AppSystem"));
		// if so, adds the item from the sample.txt to the itemCollection
		Scanner reader = new Scanner("sample.txt"); // *** COME BACK TO THIS ***

	}

	public TheSystem(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		// This method takes Item object as a parameter, then it checks if the
		// item.getQuantity() is greater than or equal than item.getAvailableQuatity().
		// If it is, display the message.
		if(item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the card. " +
		"System only has " + item.getAvailableQuantity() + " " + item.getItemName() + "('s).");
			return false;
		}
		return true;
	}

	public Boolean add(Item item) {
		// if item is NULL, return false
		// still need to remind myself if null is exist or non existent
		if(item == null) {
			return false;
		}// if it is already in the collection and is available
		 // breathe, focus on how to check the information on how to get the information from
		// the itemCollection
		// && is checkAvailability(item)
		else if(itemCollection.equals(item) && checkAvailability(item)) {
			// increase the quantity by one
			// why does it like getAvailableQuantity when set has the integer value???
			Integer addQuantity = item.getAvailableQuantity() + 1;
			// and return true
			return true;
		}// if the item ISN NOT in the collection
		if(!itemCollection.equals(item)) {
			// add the item to the collection
			// the HASHMAP is the itemCollection
			// the ITEM is what you want to increase silly not the hashmap
			item.setQuantity(1);
			return true;
		}
		// in all other cases, return false
		return false;
	}

	public Item remove(String itemName) {
		// check if the item is in the collection
		if(itemCollection.equals(itemName)) {
			// if it is, remove it
			Item itemRemove = itemName.getQuantity() - 1;
		}
	}

	public abstract void display();

	// GETTERS/SETTERS
	public HashMap<String, Item> getItemCollection() {
		return itemCollection;

	}

	public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

	// ITEMCOLLECTION TOSTRING
	@Override
	public String toString() {
		return "TheSystem [itemCollection=" + itemCollection + "]";
	}

}
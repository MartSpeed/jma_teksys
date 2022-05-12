package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	TheSystem() {
		itemCollection = new HashMap<>();
		if (getClass().getSimpleName().equals("AppSystem")) {
			try (Scanner in = new Scanner(new File("resources//sample.txt"));) {
				while (in.hasNextLine()) {
					String[] itemInfo = in.nextLine().split("  ");
					double price = Double.parseDouble(itemInfo[2]);
					int quantity = Integer.parseInt(itemInfo[3]);
					itemCollection.put(itemInfo[0], new Item(itemInfo[0], itemInfo[1], price, quantity));
				}

			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
				e.getStackTrace();
			}
		}
	}

	public HashMap<String, Item> getItemCollection() {
		// Your code here
		return itemCollection;
	}

	public void setItemCollection(HashMap<String, Item> item) {
		this.itemCollection = item;
	}

	public Boolean checkAvailability(Item item) {
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the cart. System only has "
					+ item.getAvailableQuantity() + " " + item.getItemName() + "s");
			return false;
		}
		return true;

	}

	public Boolean add(Item item) {
		if (item != null) {
			if (itemCollection.containsKey(item.getItemName()) && checkAvailability(item)) {
				int qu = item.getQuantity() + 1;
				item.setQuantity(qu);
				itemCollection.replace(item.getItemName(), item);
				return true;
			} else if (!itemCollection.containsKey(item.getItemName())) {
				item.setQuantity(1);
				itemCollection.put(item.getItemName(), item);
				return true;
			}
			return false;

		}
		return false;
	}

	public Item remove(String itemName) {
		if (itemCollection.containsKey(itemName)) {
			Item rem = itemCollection.get(itemName);
			int itemQuant = rem.getQuantity();
			rem.setAvailableQuantity(rem.getAvailableQuantity() + itemQuant);
			itemCollection.remove(itemName);
			return rem;
		}
		return null;
	}

	public abstract void display();
}
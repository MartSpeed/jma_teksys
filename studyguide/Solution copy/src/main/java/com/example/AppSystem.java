package com.example;

import java.util.HashMap;

public class AppSystem extends TheSystem {
	AppSystem() {
	}

	@Override
	public void display() {

		System.out.println("AppSystem Inventory:");

		HashMap<String, Item> items = getItemCollection();

		System.out.printf("%-20s %-20s %-10s %-10s%n", "Name", "Description", "Price", "Available Quantity");

		items.entrySet().forEach(entry -> {
			Item it = entry.getValue();

			System.out.printf("%-20s %-20s %-10.2f %-10d%n", it.getItemName(), it.getItemDesc(), it.getItemPrice(),
					it.getAvailableQuantity());
		});

	}

	@Override
	public Boolean add(Item item) {
		if (item != null) {
			if (getItemCollection().containsKey(item.getItemName())) {
				System.out.println(item.getItemName() + " is already in the App System.");
				return false;
			} else {
				getItemCollection().put(item.getItemName(), item);
				return true;
			}
		} else {
			return false;
		}
	}

	public Item reduceAvailableQuantity(String item_name) {
		if (getItemCollection().containsKey(item_name)) {
			Item i = getItemCollection().get(item_name);
			i.setAvailableQuantity(i.getAvailableQuantity() - 1);
			if (i.getAvailableQuantity() <= 0) {
				getItemCollection().remove(item_name);
				return i;
			}
			getItemCollection().replace(item_name, i);
			return i;
		} else {
			return null;
		}
	}
}
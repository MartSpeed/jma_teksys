package practice_anthony_john;

import java.util.ArrayList;

public class PracticeArrayLists {

	public static void main(String[] args) {
		
		// ===ArrayList Concepts and Practice===
		// Standard Array
		String[] fruits = new String[3];
		fruits[0] = "Pineapple";
		fruits[1] = "Strawberry";
		fruits[2] = "Dragon Fruit";
		System.out.println("this is a standard array output of " + fruits[0]);
		System.out.println("this is a standard array output of " + fruits[1]);
		System.out.println("this is a standard array output of " + fruits[2]);
		System.out.println("=====End of standard array=====\n");
		
		//ArrayList
		// import ArrayList methods
		// add the ArrayList argument <String>, <Integer>, <Boolean>
		// use the dot.operator for ArrayList methods to use
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Coconut");
		fruitList.add("Mango");
		fruitList.add("Papaya");
		fruitList.add("Apple");
		fruitList.add("Kiwi");
		
		System.out.println("This is the fruitList ArrayList\n " + fruitList);
		
		// using the .remove() method
		fruitList.remove("Apple");
		System.out.println("ArrayList.remove() method" + fruitList);
		System.out.println("Question? Can you store the removed object and log it into something?\n" + fruitList.remove("Kiwi"));
		
		// you can use the .clear() method to remove all items from the arrayList
		fruitList.clear();
		System.out.println("The fruitList contains\n" + fruitList);
		
		// reset the fruitList
		fruitList.add("Coconut");
		fruitList.add("Mango");
		fruitList.add("Papaya");
		fruitList.add("Apple");
		fruitList.add("Kiwi");
		System.out.println("Instantiate new ArrayList\n " + fruitList);
		
		// we can check to see if the fruitList contains "something"
		Boolean aContainer = fruitList.contains("Apple");
		Boolean bContainer = fruitList.contains("Blackberry");
		System.out.println("This is a Boolean, set to an object?\n" + aContainer + "\n" + "This is a Boolean object, probably?\n" + bContainer);
		System.out.println("=====End of the ArrayList=====");

	}

}

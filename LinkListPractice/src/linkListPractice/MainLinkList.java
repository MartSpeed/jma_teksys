package linkListPractice;

//import java.time.DayOfWeek;
//import java.util.EnumMap;
//import java.util.HashMap;
//import java.util.LinkedList;
import java.util.*; 

public class MainLinkList {
	
	 
	// Collections
	// More OOP
	
// Linked list uses an integer value
	// LinkedList have an index
	// LinkedList need to be imported
	// BIG O Notation**
	// ideal for using STACKS and QUES
	// LinkedList take more memory than ArrayList
	LinkedList<Integer> linkOne = new LinkedList<Integer>();
	System.out.println(linkOne.add(23));	
	linkOne.add(12)
	//linkOne.add(4, 56)
	//System.out.println(linkOne.get(23));
	//linkOne.get(4)
	// set allows us to edit the specific index in that value
	//linkOne.set(0,98)
	//linkOne.indexOf(12)
	//linkOne.remove(3)
	//linkOne.size();
	//linkOne.contains(34);
	// Node top and bottom
	
	//*** Map ***
	
	// if we had a day of the week
//	// need to import EnumMap
//	EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
//	map.put(DayOfWeek.FRIDAY, 23);
//	
//	// *** HashMap ***
//	HashMap<Integer, String> cars = new HashMap<>();
//	cars.containsValue(cars);
//	cars.containsKey(cars);
	
	// ***SET INTERFACE***
	// unordered set of 
	HashSet<String> setHashList = new HashSet<String>();
	
	setHashList.add("one");
	setHashList.add("two");
	setHashList.add("albedo");
	setHashList.add("musasibou");
	setHashList.add("two");
	
	// create an iterator to go through the list
	Iterator<String> itr = set.Iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

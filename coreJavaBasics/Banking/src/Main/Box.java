package Main;

import java.util.ArrayList;
import java.util.List;

// GENERIC CLASS
public class Box<T> {
	List<T> values;
	
	// constructor
	public Box() {
		// values
		values = new ArrayList<T>();
	}
	
	public void add(T value) {
		values.add(value);
	}
	
	public List<T> get () {
		// get the values and return them
		// return a list of something
		return values;
	}
}

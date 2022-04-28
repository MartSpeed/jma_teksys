package functional_Interfaces;

import java.util.StringJoiner;

//declaration*
@FunctionalInterface
interface addMethod{
	// method to take two numbers and adds them together
}

public class Functional_Interfaces_Main {

	public static void main(String[] args) {
		// functional interfaces take a single abstract method (S.A.M.)
		
		// stringJoiner
		// joins strings by:
		// always import utils for new methods?
		
		  StringJoiner joinName = new StringJoiner(", ","[","]");
		  joinName.add("Anthony"); joinName.add("Albedo"); joinName.add("Albion");
		  
		  System.out.println("this is the StringJoiner\n" + joinName);
		  
		  StringJoiner joinName2 = new StringJoiner("-","(",")");
		  joinName2.add("Musasibou"); joinName2.add("Oda");
		  
		  //merging names using String joiner 
		  StringJoiner m = joinName2.merge(joinName); System.out.println(m);
		 
		
		// StringBuffer class
		// creates a mutable
		StringBuffer sb = new StringBuffer("Barge in! Relate mere war of 1991 for a were-metal Ernie grab!");
		// append method
		sb.append(" appending true");
		// insert method
		sb.insert(5, " inserting false");
		// replace method
		sb.replace(0, 5, " Fresh");
		// delete method
		sb.delete(0, 6);
		// reverse method
		sb.reverse();
		System.out.println(sb);
		
	}

}

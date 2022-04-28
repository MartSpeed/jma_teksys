package functional_Interfaces;

import java.util.*;

//declaration*
@FunctionalInterface
interface AddMethod {
	// method to take two numbers and adds them together
	//public void msg();

	int add(int a, int b);
}

public class Functional_Interfaces_Main {

	public static void main(String[] args) {
		// functional interfaces take a single abstract method (S.A.M.)

		// stringJoiner
		// joins strings by:
		// always import utils for new methods?

		StringJoiner joinName = new StringJoiner(", ", "[", "]");
		joinName.add("Anthony");
		joinName.add("Albedo");
		joinName.add("Albion");

		System.out.println("this is the StringJoiner\n" + joinName);

		StringJoiner joinName2 = new StringJoiner("-", "(", ")");
		joinName2.add("Musasibou");
		joinName2.add("Oda");

		// merging names using String joiner
		StringJoiner m = joinName2.merge(joinName);
		System.out.println(m);
		System.out.println("=====END OF STRING JOINER======\n");

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
		System.out.println("=====END OF STRING BUFFER======\n");

		// LAMBDA practice (exaggerated arrow function)
		// () ->
		// can only use with functional interface
		// functional interface can 

		/*
		 * AddMethod me = ()-> {
		 * System.out.println("Yellow Valkyrie needs food BADLY!\n"); }; me.msg();
		 * 
		 * AddMethod say = ()-> {
		 * System.out.println("That sentence had to TOO MANY syllables... APOLOGIZE!\n"
		 * ); }; say.msg();
		 */
		
		// single line lambda output
		AddMethod addOne = (a,b)->(a+b);
		 System.out.println(addOne.add(10,40)  + "\n");
		 
		 // multiline output
			/*
			 * AddMethod addOne = (a,b)->{ System.out.println(a+b); }; addOne.add(35, 25);
			 */
		 
		 // creating a list for a foreach loop lambda
		 List<String> listOne = new ArrayList<>();
		 listOne.add("Zorro");
		 listOne.add("Jimbei");
		 listOne.add("Kaku");
		 listOne.add("Lucci");
		 
		 // lambda for-each
		 // lambda requires semicolon at the end rather than in the print method
		 listOne.forEach((n)-> System.out.println(n));
	}

}

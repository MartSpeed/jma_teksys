package practice_anthony_john;

// IMPORTS
import java.util.Arrays;
import java.util.TreeSet;

public class PracticeTreeSet {

	public static void main(String[] args) {
		System.out.println("=====Beginning of TreeSet Practice=====");
		
		// Sets do not contain nor list duplicate values (the)
		String phrase = "the quick brown fox jumps over the lazy dog";
		String quote = "12, 14, 66, 89, 1";
		// split them into an Array using the spaces that exist in the String
		String[] phraseList = phrase.split(" ");
		//
		String[] quoteList = quote.split(",");

		// give TreeSet an arg <String>,<Integer>,<Boolean>
		TreeSet<String> words = new TreeSet<>();
		TreeSet<String> numbers = new TreeSet<>();
		//
		words.addAll(Arrays.asList(phraseList));
		numbers.addAll(Arrays.asList(quoteList));

		// for-each loop for word treeset
		for (String w : words) {
			System.out.println(w);
		}
		System.out.println("this is the for-each loop of the treeset");

		for (String n : numbers) {
			System.out.println(n);
		}
		System.out.println("Treesets print out an ordered list of compenent. Alphabetically or otherwise");
		System.out.println("=====End of the Treeset Practice implementation=====");
	}

}

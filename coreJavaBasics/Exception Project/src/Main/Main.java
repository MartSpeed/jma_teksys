/*JAVA EXCEPTION HANDLING PROJECT and NOTES
 * GOOD-TO-KNOW:
 * 	when creating a new exception, make a new file, week of April 24th
 * 
 * 	[] checked exceptions: compile time exception
 * 	[] unchecked exceptions:
 * 	[] you can have multiple catch: a multiblock catch
 *  [] e.printStackTrace(); will list all exceptions inside of the console
 *  [] creating your own exception
 *  
 *  NOTE: when you THROW an EXCEPTION, TRY/CATCH is not required
 * */

package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	// Exceptions
	public static void main(String[] args) throws CustomExceptionFile{
		// checked exceptions
		// we can call the file
		// for the file reader system
		File ogFile = new File("text.txt"); // take the file and store it
		/*
		 * try { FileReader readFile = new FileReader(ogFile); // reads text file we
		 * want int num[] = { 1, 2, 3, 4 }; System.out.println(num[2]); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); } catch
		 * (ArrayIndexOutOfBoundsException ea) { ea.printStackTrace(); }finally {
		 * System.out.println("No defects noted"); }
		 */
	}
	
	/*
	 * public static void withdraw(double amount) throws CustomExceptionFile{
	 * if(amount <= balance) { balance -= amount; }else { double accountBelow =
	 * amount - balance; throw new CustomExceptionFile(accountBelow); } }
	 */

}

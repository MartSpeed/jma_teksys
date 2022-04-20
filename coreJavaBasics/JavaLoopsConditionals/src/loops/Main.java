package loops;

import java.util.Scanner;

// java continues to be dumb
public class Main {
	public static void main(String[] arg) {
		/*
		 * int num = 12;
		 * 
		 * int otherNum = 7;
		 * 
		 * // boolean boolean isEven = num % 2 == 0;
		 * 
		 * // if statement if ((num % 2 == 0) && (num % 3 == 0))
		 * System.out.println("even from the top");
		 * 
		 * // if & else statement int age = 24;
		 * 
		 * if (age > 15 && age < 18) { System.out.println("in range"); } else if (age >
		 * 18 && age < 25) { System.out.println("in range over the age of 18"); } else {
		 * System.out.println("not in range"); }
		 * 
		 * // scanner system.in to take in user input Scanner userInput = new
		 * Scanner(System.in);
		 * 
		 * System.out.println("Hi, what is your name? "); String firstName =
		 * userInput.nextLine();
		 * 
		 * System.out.println("Whats is your age? "); int userAge = userInput.nextInt();
		 * 
		 * if (userAge > 17) { System.out.println(firstName + ", You may pass"); } else
		 * { System.out.println("Sorry " + firstName + " You are not old enough"); }
		 * 
		 * userInput.close();
		 */

		/*
		 * switch() { case value1: // code break; case value2: // code break; case
		 * value3: // code break;
		 * 
		 * default:
		 */
		// default statement to end the program

		/*
		 * int day = 2; switch (day) { 
		 * case 1: System.out.println("Monday");
		 * 	break; 
		 * case 2: System.out.println("Tuesday");
		 * 	break; 
		 * case 3:
		 * System.out.println("Wednesday"); break; case 4:
		 * System.out.println("Thursday"); break; default:
		 * System.out.println("Im on break");
		 * 
		 * }
		 * 
		 * // ternary operator boolean exp = (3<=10) ? true : false;
		 * 
		 * System.out.println(exp);
		 */

		// LOOPS

		// while loop
		/*
		 * boolean flag = true; int count = 0; // while the condition is false, it will
		 * keep running while(count <= 20) { System.out.println("I have " + count +
		 * " doggos" ); ++count; }
		 */

		// do while loop
		/*
		 * int count = 0; do { // loop will run once before it checks the condition
		 * System.out.println("Not my " + count + " CABBAGES!!"); ++count; } while
		 * (count <= 15);
		 */

		// for loop
		// for (initialize action; condition, after iteration
		// for (star variable; condition to be; add one to the iteration)

		/*
		 * for (int count = 0; count <= 10; ++count) { System.out.println("i have lost "
		 * + count + " ... " + count + " socks, AH AH AH"); }
		 */

		// nested for loops
		for (int i = 0; i <= 10; ++i) {
			System.out.println(i+" EXP");
			for (int j = 1; j <= 2; ++j) {
				System.out.println(j + " LEVEL UP");
			}
		}
		// break $ continue

	}
}

/*Create a Java Project in Eclipse called CoreJavaBasics. In the src
 * folder, make a package and name it com.perscholas.java_basics. Create
 * a class with a main( ) method to run the following exercises (You may
 * name the class whatever you like. Examples: JavaBasicsClass, HomeClass,
 * IndexClass, PracticeClass, etc.).*/

package com.perscholas.java_basics;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1. Write a program that declares 2 integer variables, assigns an integer to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */
		// declare 2 integers
		int myNum1 = 7;
		int myNum2 = 6;

		// assigns an integer to each
		myNum1 = 6;
		myNum2 = 7;

		// add them together
		// assign sum to variable
		int result = myNum1 + myNum2;

		System.out.println("answer 1: " + result);

		/*
		 * 2. Write a program that declares 2 double variables, assigns a number to
		 * each, and adds them together. Assign the sum to a variable. Print out the
		 * result.
		 */

		// declare 2 double variables
		double doNum1;
		double doNum2;

		// assign a number to each
		doNum1 = 19.99d;
		doNum2 = 27.98d;

		// add them together
		// assign sum to variable
		double dResult = doNum1 + doNum2;
		System.out.println("answer 2: " + dResult);

		/*
		 * 3. Write a program that declares an integer variable and a double variable,
		 * assigns numbers to each, and adds them together. Assign the sum to a
		 * variable. Print out the result. What variable type must the sum be?
		 */

		// declare an int variable
		// declare a double variable
		int iNum;
		double dNum;

		// assign numbers to each variable
		iNum = 34;
		dNum = 88.97d;

		// add them together
		// assign sum to a variable
		double iResult = iNum + dNum;
		System.out.println("answer 3: " + iResult);

		/*
		 * 4. Write a program that declares 2 integer variables, assigns an integer to
		 * each, and divides the larger number by the smaller number. Assign the result
		 * to a variable. Print out the result. Now change the larger number to a
		 * decimal. What happens? What corrections are needed?
		 */
		// 2 int variables
		int myInt1 = 6;
		double myInt2 = 7.6d;

		// divide the larger number by the smaller number
		double diResult = myInt2 / myInt1;
		// use double for decimal numbers
		System.out.println("answer 4: " + diResult);

		/*
		 * 5. Write a program that declares 2 double variables, assigns a number to
		 * each, and divides the larger by the smaller. Assign the result to a variable.
		 * Print out the result. Now, cast the result to an integer. Print out the
		 * result again.
		 */

		// 2 double variables
		double dNum1 = 7.6;
		// cast double to int
		int dInt1 = (int) dNum1;
		double dNum2 = 6.7;
		// cast double to int
		int dInt2 = (int) dNum2;

		// divide the larger by the smaller
		double dpResult = dNum1 / dNum2;
		int dpInt = (int) dpResult;
		System.out.println("answer 5: " + dpResult);
		// cast the result an int
		System.out.println("alt answer 5:  " + dpInt);

		/*
		 * 6. Write a program that declares 2 integer variables, x, and y, and assign 5
		 * to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
		 * cast y to a double and assign to q. Print q again.
		 */

		// declare 2 int variables
		int x = 5;
		int y = 6;
		int q = y / x;
		// print q
		System.out.println("alt answer 6:  " + q);

		// cast y to a double and assign to q
		double yDouble = y;
		y = q;
		System.out.println("answer 6: " + q);

		/*
		 * 7. Write a program that declares a named constant and uses it in a
		 * calculation. Print the result.
		 */

		// declare a named constant
		final float myFloat = 35.6f;
		double fiResult = myFloat * dNum2;
		System.out.println("answer 7: " + fiResult);

		/*
		 * 8. Write a program where you create 3 variables that represent products at a
		 * cafe. The products could be beverages like coffee, cappuccino, espresso,
		 * green tea, etc. Assign prices to each product. Create 2 more variables called
		 * subtotal and totalSale and complete an “order” for 3 items of the first
		 * product, 4 items of the second product, and 2 items of the third product. Add
		 * them all together to calculate the subtotal. Create a constant called
		 * SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
		 * Be sure to format the results to 2 decimal places.
		 */

		// 3 variables the represent cafe products
		String mug1 = "coffee";
		String mug2 = "cappuccino";
		String mug3 = "espresso";

		// assign prices to each product
		double coffee = 19.99d;
		double cappuccino = 14.99d;
		double espresso = 11.99d;

		// 2 variables subtotal and totalSale
		double subtotal;
		double totalSale;
		
		// myorder
		// 3 items of the first product
		// 4 items of the second product
		// 2 items of the third product
		// add them all together
		subtotal = (coffee * 3) + (cappuccino * 4) + (espresso * 2);
				System.out.println("subtotal: $" + subtotal);
		
		
		// constant SALES_TAX
		// add SALES_TAX to subtotal
		final double SALES_TAX = 1.075;
		totalSale = (int)(SALES_TAX + subtotal);
		System.out.println("Your total is $" + totalSale);
	}
}
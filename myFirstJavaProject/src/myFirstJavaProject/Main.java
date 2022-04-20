/* Include a summary at the beginning of the program to
 * explain what the program does, its key features, its
 * supporting data structures, and any unique techniques
 * it uses. 
 * 
 * include your name, class section, instructor, date,
 * and a brief description
 * */

// import files go at the top
package myFirstJavaProject;


import java.util.Scanner;

public class Main {
	/*
	 * starting point
	 * 
	 * Runner - main, that runs the code
	 * 
	 * slide 11 slide 18 -19
	 */
	public static void main(String[] args) {
		String name = "Albedo";

		// TODO Auto-generated method stub
		// Execute statement
		System.out.println("welcome to java, " + name);

		// JAVA MATH
		// whole numbers and primitives only
		// int number = 120;
		// char charValue = 'a';
		// byte byteNumber = 41;
		// long longNumber = 1232345l;
		// boolean turthOfFalse = true;
		// float paycheck = 1234.89f;
		// wrapper class integer
		// Integer num = 203;
		//
		// double radius;
		// double area;

		// assigning a value
		// radius = 20;
		// area = radius * radius * 3.14159;

		// System.out.println("the radius is: " + radius + " and the area is: " + area);

		// int x = 5;
		// int result = x + 5;
		// System.out.println(result);
		// result = x * 5;
		// System.out.println(result);
		// result = x / 5;
		// System.out.println(result);
		// result = x % 5;
		// System.out.println("moj " + result);

		// math operators
		// math.floor(paycheck);
		// math.abs(singleValue);
		// math.random();
		// Math.round(paycheck);
		// Math.sqrt(paycheck);

		// relational operators slide 40 java fundies slides
		// System.out.println(7 == 7);
		// System.out.println(7 != 7);
		// System.out.println(7 <= 7);
		// System.out.println(7 >= 7);

		// conditional operators
		// System.out.println(6 > 7 && 7 > 6);
		// System.out.println(6 > 7 || 7 > 6);

		// SCANNER CLASS, is a variable name, can be taco
		// to use the scanner, you need user input

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter you name: ");
		String firstName = userInput.nextLine();
		System.out.println("My name is " + firstName);

		// close the scanner; end of class
		userInput.close();

	}

}

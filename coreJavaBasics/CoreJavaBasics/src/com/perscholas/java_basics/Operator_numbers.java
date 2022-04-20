package com.perscholas.java_basics;

import java.util.Arrays;

public class Operator_numbers {

	public static void main(String[] args) {
		/*
		 * 1. Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods.
		 * 
		 * 1 = 0001 8 = 1000 33 = 0010 0001 78 = 0100 1110 787 = 0011 0001 0011 33987 =
		 * 1000010011000011
		 */

		/*
		 * 2. Convert the following binary numbers to decimal notation. Do not use any
		 * Java functions or online conversion applications to calculate the answer as
		 * this will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods.
		 * 
		 * 0010 = 2 1001 = 9 0011 0100 = 52 0111 0010 = 114 0010 0001 1111 = 543 0010
		 * 1100 0110 0111 = 11367
		 */

		/*
		 * 3. Write a program that declares an integer a variable x and assigns the
		 * value 2 to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation.
		 * 
		 * Do the preceding exercise with the following values: 9, 17, 88
		 */

		// declare integer x the value 2
		int x = 2;

		// prints out the binary string version
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);

		// use the left shift operator << to shift by 1
		// assign to x

		int shift = x << 1;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);
		// 9
		x = 9;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		shift = x << 1;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);
		// 17
		x = 17;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		shift = x << 1;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);
		// 88
		x = 88;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		shift = x << 1;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);

		/*
		 * 4. Write a program that declares a variable x and assigns 150 to it and
		 * prints out the binary string version of the number. Now use the right shift
		 * operator (>>) to shift by 2 and assign the result to x. Write a comment
		 * indicating what you anticipate the decimal and binary values to be. Now print
		 * the value of x and the binary string.
		 * 
		 * Do the preceding exercise with the following values: 255, 1555, 32456
		 */

		// 150
		x = 150;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		// right shift 2 spaces
		shift = x >> 2;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);

		// 255
		x = 255;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		// right shift 2 spaces
		shift = x >> 2;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);

		// 1555
		x = 1555;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		// right shift 2 spaces
		shift = x >> 2;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);

		// 32456
		x = 32456;
		System.out.println(Integer.toBinaryString(x) + " is binary for the number " + x);
		// right shift 2 spaces
		shift = x >> 2;
		System.out.println(Integer.toBinaryString(shift) + " is the shift for number: " + x);

		/*
		 * 5. Write a program that declares 3 int variables x, y, and z. Assign 7 to x
		 * and 17 to y. Write a comment that indicates what you predict will be the
		 * result of the (bitwise &) operation on x and y. Now use the (bitwise &)
		 * operator to derive the decimal and binary values and assign the result to z.
		 * 
		 * Now, with the preceding values, use the bitwise | operator to calculate the
		 * “or” value between x and y. As before, write a comment that indicates what
		 * you predict the values to be before printing them out
		 */

		//
		x = 7;
		int y = 17;
		int z = x & y;
		System.out.println("decimal & value: " + z);
		System.out.println("binary & value: " + Integer.toBinaryString(z));
		z = x | y;
		System.out.println("decimal OR value: " + z);
		System.out.println("binary OR value: " + Integer.toBinaryString(z));

		/*
		 * 6. Write a program that declares an integer variable, assigns a number, and
		 * uses a postfix increment operator to increase the value. Print the value
		 * before and after the increment operator.
		 */

		// declare an int variable
		x = 35;
		System.out.println("before increment: " + x);
		++x;
		System.out.println("after postfix increment: " + x);

		/*
		 * 7. Write a program that demonstrates at least 3 ways to increment a variable
		 * by 1 and does this multiple times. Assign a value to an integer variable,
		 * print it, increment by 1, print it again, increment by 1, and then print
		 * again.
		 */

		x = 30;
		x = x + 1;
		System.out.println("increment version 1: " + x);
		x += 1;
		System.out.println("increment version 2: " + x);
		++x;
		System.out.println("increment version 3: " + x);

		/*
		 * 8. Write a program that declares 2 integer variables, x, and y, and then
		 * assigns 5 to x and 8 to y. Create another variable sum and assign the value
		 * of ++x added to y and print the result. Notice the value of the sum (should
		 * be 14). Now change the increment operator to postfix (x++) and re-run the
		 * program. Notice what the value of sum is. The first configuration incremented
		 * x and then calculated the sum while the second configuration calculated the
		 * sum and then incremented x.
		 */
		
		// 2 int variables
		x = 5;
		y = 8;
		int sum = (++x) + y;
		System.out.println("this is the ++x sum: " + sum);
		// postfix x++
		sum = (x++) + y;
		System.out.println("this is the x++ sum: " + sum);

	}

}

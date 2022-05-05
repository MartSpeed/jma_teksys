package codeblocks_ifstatement;

public class CodeBlock {

	public static void main(String[] args) {

		// If
		boolean gameOver = true;
		int Score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		// Code Block
//		if(Score < 5000 && Score > 1000) {
//			System.out.println("Your score was less then 5000 but greater than 1000");
//		}else if(Score < 1000) {
//			System.out.println("Your score was less then 1000");
//		}else {
//			System.out.println("got here");
//		}

		// the concept of variables inside of the codeblock is called SCOPE
		if (gameOver) {
			int finalScore = Score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		// CHALLENGE
		/*
		 * Print out a second score on the screen with the following score set to 10000
		 * levelcCompleted set to 8 bonus set t0 200 But make sure the first printout
		 * above still displays as well
		 */

		if (gameOver == true) {
			Score = 10000;
			levelCompleted = 8;
			bonus = 200;
			int finalScore = Score + (levelCompleted * bonus);
			System.out.println("You final score was " + finalScore);
		}

	}

}

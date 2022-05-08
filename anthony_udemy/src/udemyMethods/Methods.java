package udemyMethods;

public class Methods {

	public static void main(String[] args) {

		// methods using the fields
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		// method expression
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus); // method with args
		System.out.println("method expression " + highScore);

		// method with reassigned fields
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		// method expression
		highScore = calculateScore(gameOver, score, levelCompleted, bonus); // method with args
		System.out.println("method expression " + highScore);
		
		/* test
		 *CHALLENGE
		 *create a a method called displayHighScorePosition
		 *it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
		 *you should display the players name along with a message "on the high score table".
		 *
		 *create a 2nd method called calculateHighScorePosition
		 *it should be sent one argument only, the player score
		 *it should return an int
		 *the return data should be
		 *1 if the score > 1000
		 *2 if the score is > 500 and < 1000
		 *3 if the score is > 100 and < 500
		 *4 in all other cases
		 *call both methods and display the results of the following
		 *a score of 1500, 900, 500 and 50*/

		// method with false arg
		gameOver = false;
		score = 600;
		levelCompleted = 5;
		bonus = 700;

		// method expression
		highScore = calculateScore(gameOver, score, levelCompleted, bonus); // method with args
		System.out.println("method expression " + highScore);

	}

	// calculate score method
	// when not using void, you need to return a value in the method
	// the type of method created, is the type used in the method expression
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		// methods
		if (gameOver) { // defaults to if gameOver == true
			int finalScore = score + (levelCompleted * bonus); // local finalScore variable expression
			finalScore += 2000; // add 1000 to the finalScore total
			return finalScore;
		}
		return -1;
	}
}

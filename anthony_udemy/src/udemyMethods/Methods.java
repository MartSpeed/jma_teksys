package udemyMethods;

public class Methods {

	public static protected void main(String[] args) {

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

		/*
		 * CHALLENGE create a a method called displayHighScorePosition it should receive
		 * a players name as a parameter, and a 2nd parameter as a position in the high
		 * score table you should display the players name along with a message
		 * "on the high score table".
		 *
		 * create a 2nd method called calculateHighScorePosition it should be sent one
		 * argument only, the player score it should return an int the return data
		 * should be 1 if the score > 1000 2 if the score is > 500 and < 1000 3 if the
		 * score is > 100 and < 500 4 in all other cases call both methods and display
		 * the results of the following a score of 1500, 900, 400 and 50
		 */

		// method with false arg
		gameOver = false;
		score = 600;
		levelCompleted = 5;
		bonus = 700;

		// method expression
		highScore = calculateScore(gameOver, score, levelCompleted, bonus); // method with args
		System.out.println("method expression " + highScore);

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Luffy", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Zoro", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Chopper", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Jimbei", highScorePosition);

		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Robin", highScorePosition);

		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Yamato", highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Brook", highScorePosition);
	}

	// receive String playerName, int highScorePosition in args
	// display the players name with highScorePosition message
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(
				playerName + " managed to get into position " + highScorePosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		}
		return 4;
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

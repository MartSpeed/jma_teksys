package testing;

public class Player {

	// fields
	private String playerName;

	// constructors
	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}

	public Player() {
		super();
	}
	
	// getters and setters
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}

	
}

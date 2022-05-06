package testing;

import java.util.ArrayList;

public class Game {
	//
	private String player;
	//

	ArrayList<Player> playerList = new ArrayList<>();

	// default constructor
	public Game() {
		super();
	}

	public Game(String player, ArrayList<Player> playerList) {
		super();
		this.player = player;
		this.playerList = playerList;
	}

	// getters/setters
	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}

	// extra class methods
	public boolean add(Player player) {
		playerList.add(player);
		return true;
	}
	
	public void getWinner() {
		System.out.println("Winner");
	}

	@Override
	public String toString() {
		return "Game [player=" + player + ", playerList=" + playerList + "]";
	}

}

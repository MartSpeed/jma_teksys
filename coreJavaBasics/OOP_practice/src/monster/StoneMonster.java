package monster;

// extends to Monster class
public class StoneMonster extends Monster {

	// call the string arg
	public StoneMonster(String monsterName) {
		// super keyword
		super(monsterName);
	}

	// subclass String method
	public String attack() {
		return "Attack with stone!";
	}

}

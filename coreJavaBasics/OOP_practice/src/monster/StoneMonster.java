package monster;

// extends to Monster class
public class StoneMonster extends Monster {

	// call the string arg
	public StoneMonster(String monsterName) {
		// super keyword
		super(monsterName);
	}

	// subclass String method
	// SUBCLASS DOES NOT TAKE A STRING ARG!!!!!
	public String attack() {
		return "Attack with stone!";
	}

}

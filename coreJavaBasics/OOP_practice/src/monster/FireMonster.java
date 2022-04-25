package monster;

// extend the Monster class
public class FireMonster extends Monster {

	// calling the string arg
	public FireMonster(String monsterName) {
		super(monsterName);
	}

	// subclass String method
	public String attack() {
		return "Attack with fire!";
	}

}

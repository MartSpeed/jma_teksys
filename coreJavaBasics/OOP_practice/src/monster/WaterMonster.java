package monster;

// extends to Monster class
public class WaterMonster extends Monster {

	// calling the string arg
	public WaterMonster(String monsterName) {
		// super keyword
		super(monsterName);
	}

	// subclass String method
	public String attack() {
		return "Attack with water!";
	}

}

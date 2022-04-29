package monster;

// extends to Monster class
public class WaterMonster extends Monster {

	// calling the string arg
	public WaterMonster(String monsterName) {
		// super keyword
		super(monsterName);
	}

	// subclass String method
	// SUBCLASS DOES NOT TAKE A STRING ARG!!!!!
	public String attack() {
		return "EVIL WATER, gonna hurt you SO bad~!";
	}

}

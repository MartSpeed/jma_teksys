package monster;

// extend the Monster class
public class FireMonster extends Monster {
	// calling the string arg
	public FireMonster(String monsterName) {
		super("FIRE MONSTER");
	}
	
//	public String name() {
//		return this.fireMonster;
//	}

	// subclass String method
	// SUBCLASS DOES NOT TAKE A STRING ARG!!!!!
	public String attack() {
		return "Attack with fire!";
	}

}

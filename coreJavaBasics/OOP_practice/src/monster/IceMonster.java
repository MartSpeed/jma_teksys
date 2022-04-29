package monster;

public class IceMonster extends Monster{

	// call the string arg
	public IceMonster (String monsterName) {
		// use the super keyword, go over this
		// pass in the monsterName
		super(monsterName);
	}
	
	// subclass String method to override the main monster method
	// SUBCLASS DOES NOT TAKE A STRING ARG!!!!!
	public String attack() {
		// return a string
		return "Attack with Ice Blast!";
	}
}

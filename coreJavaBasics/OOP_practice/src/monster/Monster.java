package monster;

public class Monster {
	// MONSTER VARIABLES: String name
	String monsterName;
	
	// MONSTER CONSTUCTORS: String name
	public  Monster(String monsterName) {
		this.monsterName = monsterName;
	}
	// default Sting method
	public String attack() {
		return monsterName + ", hurt itself in confusion";
	}
	
}

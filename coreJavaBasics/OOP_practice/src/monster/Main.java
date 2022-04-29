/*Scenario, In our game app, we have many types of monsters that can attack. 

[] 1. We shall design a superclass called Monster and define the method attack() in the superclass. 

[] 2. The subclasses shall then provide their actual implementation. 

[] 3. In the main program, we declare instances of superclass, substituted with actual subclass; and invoke method defined in the superclass.
*/

package monster;

public class Main {

	public static void main(String[] args) {
		// [x] program at the "interface" defined in the superclass.
		// [x] declare instances of the superclass, substituted by subclasses.
		// [x] fire monster
		Monster fireMonster = new FireMonster("duck");
		// [x] water monster
		Monster waterMonster = new WaterMonster("raven");
		// [x] stone monster
		Monster stoneMonster = new StoneMonster("strix");
		// [] ice monster
		Monster iceMonster = new IceMonster("sheetz");

		// [x] invoke the actual implementation
		System.out.println(fireMonster.attack());
		System.out.println(waterMonster.attack());
		System.out.println(stoneMonster.attack());
		System.out.println(iceMonster.attack());
		
		// [x] fire monster dies, new fire monster type instantiates
		Monster flameMonster = new Monster("goose");
		System.out.println(flameMonster.attack());
		
		// [x] something wrong
		Monster monster = new Monster("grey duck");
		System.out.println(monster.attack());
		
		// [] call new monster type
		Monster frostMonster = new IceMonster("Cypher");
		System.out.println(frostMonster.attack());
	}
}

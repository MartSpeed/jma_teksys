package monster;

public class Main {

	public static void main(String[] args) {
		// class names need to remain the same when invoking the method
		FireMonster monster1 = new FireMonster();
		WaterMonster monster2 = new WaterMonster();
		StoneMonster monster3 = new StoneMonster();

		// fire
		monster1.attack();
		monster1.fireAttack();
		// water
		monster2.attack();
		monster2.waterAttack();
		//stone
		monster3.attack();
		monster3.stoneAttack();

	}

}

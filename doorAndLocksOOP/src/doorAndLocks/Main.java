package doorAndLocks;

public class Main {

	public static void main(String[] args) {

		Key key = new Key(KeyShape.Oval);
		System.out.println("Your RAID Key is: " + key + "\nYour shape is " + key.shape());

		// cloning the object
		Key spareKey = (Key) key.clone();

		// creating a door
		Door d1 = new Door(spareKey);

		Keychain kc1 = new Keychain();
		kc1.addKey(key);
		kc1.addKey(key);
		kc1.addKey(spareKey);
		kc1.addKey(spareKey);
		kc1.keyCount();

		System.out.println(
				"You currently have " + kc1.keyCount() + " key on your Keychain.");
		
		System.out.println("this is Door 1\n" + d1);

	}

}

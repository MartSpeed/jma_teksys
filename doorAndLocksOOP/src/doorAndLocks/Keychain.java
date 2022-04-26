package doorAndLocks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Keychain {
	// set of keys to open doors
	// private Set<Key> keys = new TreeSet<Key>();
	// HashSet of keys to orgaHashMap<K, V>ys by shape
	private HashMap<KeyShape, ArrayList<Key>> keys = new HashMap<KeyShape, ArrayList<Key>>();

	// ***CONSTRUCTORS***
	public Keychain() {

	}

	public Keychain(Collection<Key> keys) {
		// this.keys.addAll(keys);
		for (Key k : keys) {
			addKey(k);
		}
	}

	public boolean addKey(Key key) {
		// return keys.add(key);
		if (!keys.containsKey(key.shape()))
			keys.put(key.shape(), new ArrayList<Key>());
		keys.get(key.shape()).add(key);
		return true;
	}

	public boolean removeKey(Key key) {
		// return keys.remove(key);
		if (keys.containsKey(key.shape()))
			return keys.get(key.shape()).remove(key);
		return false;
	}

	public int keyCount() {
		// return keys.size();
		int keyCount = 0;
		for (KeyShape keyShape : keys.keySet()) {
			keyCount += keys.get(keyShape).size();
		}
		return keyCount; // returns total number of keys
	}

	// locked door method
	public boolean lock(Door door) {
//		if(door.isLocked()) return true; //Nothing to do
//		for(Key k : keys) {
//			if(door.unlock(k)) return true;
//		}
//		return false; // Sorry no key locks this door

		if (door.isLocked())
			return true; // Nothing to do
		if (!door.hasKey())
			return false; // Door is already locked
		if (!keys.containsKey(door.key().shape()))
			return false; // Don't have that key
		for (Key k : keys.get(door.key().shape())) {
			if (door.unlock(k))
				return true;
		}
		return false; // Sorry, no key unlocks this door
	}

	// unlocked door method
	public boolean unlock(Door door) {
//		if(!door.isLocked()) return true; //Nothing to do
//		for(Key k : keys()) {
//			if(door.unlock(k)) return true;
//		}
//		return false; // Sorry no key unlocks this door
		if (!door.isLocked()) return true; // Nothing to do
		if (!door.hasKey())	return true; // Door is already locked
		if (!keys.containsKey(door.key().shape()))	return false; // Don't have that key
		for (Key k : keys.get(door.key().shape())) {
			if (door.unlock(k))
				return true;
		}
		return false; // Sorry, no key unlocks this door

	}
}

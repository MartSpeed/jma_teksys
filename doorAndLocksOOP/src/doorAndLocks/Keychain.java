package doorAndLocks;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Keychain {
	// set of keys to open doors
	private Set<Key> keys = new TreeSet<Key>();
	
	
	// ***CONSTRUCTORS***
	public Keychain() {
		
	}
	
	public Keychain(Collection<Key> keys) {
		this.keys.addAll(keys);
	}
	
	public boolean addKey(Key key) {
		return keys.add(key);
	}
	
	public boolean removeKey(Key key) {
		return keys.remove(key);
	}
	
	public int keyCount() {
		return keys.size();
	}
	
	// locked door method
	public boolean lock(Door door) {
		if(door.isLocked()) return true; //Nothing to do
		for(Key k : keys) {
			if(door.unlock(k)) return true;
		}
		return false; // Sorry no key locks this door
	}
	
	// unlocked door method
	public boolean unlock(Door door) {
		if(!door.isLocked()) return true; //Nothing to do
		for(Key k : keys) {
			if(door.unlock(k)) return true;
		}
		return false; // Sorry no key unlocks this door
	}
}

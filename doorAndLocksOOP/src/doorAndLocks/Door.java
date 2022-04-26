package doorAndLocks;

public class Door {
	
	// each door will have a key
	// each key will be private
	private Key key;
	private boolean isLocked;
	
	public Door(Key key) {
		this.key = key;
		isLocked = key != null;
	}
	
	public Key key() {
		return key;
	}
	
	public boolean hasKey() {
		return key != null;
	}
	
	public boolean isLocked() {
		return isLocked;
	}
	
	// locked door method
	public boolean lock(Key key) {
		if(this.key == null || this.key.equals(key)) {
			isLocked = true;
		}
		return isLocked;
	}
	// open door method
	public boolean unlock(Key key) {
		if(this.key == null || this.key.equals(key)) {
			isLocked = false;
		}
		return !isLocked;
	}
}

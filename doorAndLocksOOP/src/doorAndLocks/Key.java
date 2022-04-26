package doorAndLocks;

// java imports
import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {
	
	// key default UUID
	private UUID key = UUID.randomUUID();
	// key default shape
	private KeyShape shape = KeyShape.Unknown;

	// default Key constructor
	public Key() {
		key = UUID.randomUUID();
	}
	
	// Shape of the key
	public Key(KeyShape shape) {
		this(); // Init key using the default constructor
		this.shape = shape;
	}	

	// copy constructor
	public Key(Key original) {
		key = original.key;
		shape = original.shape;
	}
	
	public KeyShape shape() {
		return shape;
	}

	// *** OVERRIDES ***
	@Override
	public boolean equals(Object obj) {
		if (!getClass().isInstance(obj))
			return false;
		Key other = (Key) obj;
		return key.equals(other.key);
	}

	@Override
	public String toString() {
		return key.toString();
	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}

	@Override
	public Object clone() {
		return new Key(this);
	}

	@Override
	public int compareTo(Key o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

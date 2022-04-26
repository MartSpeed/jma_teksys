package doorAndLocks;

// java imports
import java.util.UUID;

public class Key implements Cloneable, Comparable<Key> {

	public UUID key = UUID.randomUUID();

	// default constructor
	public Key() {
		key = UUID.randomUUID();
	}

	public Key(Key original) {
		key = original.key;
	}

	// *** OVEERRIDES ***
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

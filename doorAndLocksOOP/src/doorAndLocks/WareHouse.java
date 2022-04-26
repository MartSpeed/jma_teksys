package doorAndLocks;

import java.util.Set;
import java.util.TreeSet;

public class WareHouse {

	// warehouse treehouse
	public Set<Door> doors = new TreeSet<Door>();

	// ***CONSTRUCTOR***
	// be sure to name and input your constructor BEFORE you start making your conditions and args
	public WareHouse() {
	int i = 0;

	for(; i<10; ++i) {
		Door d = new Door(null);
		doors.add(d);
		
	} for(;i<100;++i) {
		int num = (int) Math.random() * 4;
		KeyShape shape;

		switch (num) {
		case 0:
			shape = KeyShape.Square;
			break;
		case 1:
			shape = KeyShape.Circular;
			break;
		case 2:
			shape = KeyShape.TrapezoidDown;
		case 3:
			shape = KeyShape.Oval;
			break;
		default:
			shape = KeyShape.Square;
		}

		Key k = new Key(shape);
		Door d = new Door(k);
		doors.add(d);
		}
	}
}
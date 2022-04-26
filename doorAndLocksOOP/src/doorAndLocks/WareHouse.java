package doorAndLocks;

import java.util.Set;
import java.util.TreeSet;

public class WareHouse {
	// warehouse treehouse
	public Set<Door> doors = new TreeSet<Door>();

	// ***CONSTRUCTOR
	int i = 0;

	for(;i<10;++i)
	{
		Door d = new Door (Keys null)
				doors.add(d);
	}for(;i<100;++i)
	{
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
	}
}

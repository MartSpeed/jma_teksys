package speedConverter;

public class SpeedConverter {
<<<<<<< HEAD
	//
	public static long toMilesPerHour(double kilometerPerHour) {
		// if less than 0, return -1;
		if(kilometerPerHour < 0) {
			return -1;
		}
=======
	public static long toMilesPerHour(double kilometersPerHour) {
		// return -1 if we get an invalid value
		if(kilometersPerHour < 0) {
			return -1;
		}
		
		// kph -> mph conversion variable expression
		return Math.round(kilometersPerHour / 1.609);
	}
	
	public static void printConversion(double kilometersPerHour) {
		// calculate mph from kph
		// check for invalid value
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}else {
			long milesPerHour = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + 
			"km/h = " + milesPerHour +
			"mi/h");
		}
>>>>>>> 147e31a7e5e0ac0b508a6c2600830d37db9c2c1f
	}
}

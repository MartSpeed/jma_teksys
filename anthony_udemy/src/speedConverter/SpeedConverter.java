package speedConverter;

public class SpeedConverter {
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
			" km/h = " + milesPerHour +
			" mi/h");
		}
	}
}

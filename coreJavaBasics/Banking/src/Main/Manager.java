package Main;

// Manager is a child class of employee
// Manager will inherit employee
// use the extends keywords
public class Manager extends Employee{
// fields
	private String timeCards;
	
	// manager default constructor
	public Manager() {
		
	}

	// source -> constructors with superclass
	public Manager(String firstName, String lastName, long employeeId, String jobTitle, String timeCards) {
		super(firstName, lastName, employeeId, jobTitle);
		this.timeCards = timeCards;
		// garbage collector
	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}
// source -> generate to String
	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}
	
	
}

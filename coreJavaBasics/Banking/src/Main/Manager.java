package Main;

// Manager is a child class of employee
// Manager will inherit employee
// use the extends keywords
public class Manager extends Employee implements AccountActionsIMPL {
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

	@Override
	public void withdraw(float amount, float withdrawAmount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit(float amount, float depositAmount) {
		// TODO Auto-generated method stub

	}
	
	// can take any number of arguments as a given array
	// ...(int reference) take any many arguments as you want
	// data has to match int to int, str to str etc
	public void PrintThis(int ...val) {
		for(int i : val) {
			System.out.println(i);
		}
		
	}

}

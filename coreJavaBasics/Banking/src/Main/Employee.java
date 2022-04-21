package Main;

public class Employee {
// fields and Variables at the top
	// encapsulation 
	private String firstName;
	private String lastName;
	private long employeeId;
	private String jobTitle;

	// employee default constructor
	public Employee() {

	}

// method
	public Employee(String firstName, String lastName, long employeeId, String jobTitle) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	// this copy of the first constructor
	// this is called
	public Employee(String firstName, String lastName, long employeeId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
	}

	// different constructors allow for more flexibility
	public Employee(String firstName, long employeeId) {
		this.firstName = firstName;
		this.employeeId = employeeId;
	}

	// source -> getters & setters
	public String getFirstName() {
		return firstName;
	}

// void means we are not returning anything
// using this to set the first name, no value needs to be shown
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [" + "firstName=" + firstName + ", " + "lastName=" + lastName + ", employeeId=" + employeeId
				+ ", jobTitle=" + jobTitle + "]";
	}

	// other methods

}

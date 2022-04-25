package Main;

import java.io.FileReader;

import javax.naming.NameNotFoundException;

public class Employee extends AbstractAccountActions {
	// fields and Variables at the top
	// encapsulation
	private String firstName;
	private String lastName;
	private long employeeId;
	private String jobTitle;
	private float totalAmount;
	private String workDay;

	// employee default constructor
	public Employee() {

	}

	// method
	public Employee(String firstName, String lastName, long employeeId, String jobTitle, String workDay)
			throws CustomExceptionFile {

		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;

	}

	// BREAKOUT ROOM METHOD
	public static void dayOfWeek(String workDay) throws CustomExceptionFile {
		if (workDay == workDay) {
			System.out.println(workDay);
		} else {
			System.out.println(workDay);
			throw new CustomExceptionFile(workDay);
		}
		// try/catch method
		/*
		 * try { // look for the day of the week // FileReader readFile = new
		 * FileReader(ogFile); // reads text file we want
		 * System.out.println("the work day is " + workDay); } catch
		 * (CustomExceptionFile n) { n.printStackTrace();
		 * System.out.println("no days of the week"); }finally {
		 * System.out.println("That is not in the parameters"); }
		 */
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
				+ ", jobTitle=" + jobTitle + ", totalAmount=" + totalAmount + "]";
	}

	// other methods
	@Override
	float withdraw(int amount, int withdrawAmount) {
		totalAmount = amount - withdrawAmount;
		return totalAmount;
	}

	@Override
	float deposit(int amount, int depositAmount) {
		totalAmount = amount + depositAmount;
		return totalAmount;
	}

}

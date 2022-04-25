// CUSTOM EXCEPTION FILE FOR EMPLOYEES

package Main;

public class CustomExceptionFile extends Exception {
	private String workDay;

	// create a method from this
	public CustomExceptionFile(String workDay) {
		super(workDay);
		this.workDay = workDay;
	}
	
	public String getWorkDay() {
		return workDay;
	}
}

package fileIOProject;

public class Course {
	String code, name, instructor;
	
	// ***CONSTRUCTOR***
	public Course (String code, String name, String instructor) {
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}
	
	// GETTERS/SETTERS
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	public String getInstructor() {
		return instructor;
	}
}

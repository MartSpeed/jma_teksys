package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "employee") // how we will do an employees in the database

public class EmployeeEntity {
	// persistence name
	@Column(name = "emp_id")
// anything we inherit or extend will be or foreign key
	// sessions are the connections between our project and the database?

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emp_id;

	// generated value at the top
	private String firstName, lastName, email, city;
	private int age;
	private double salary;

	// empty constructor
	public EmployeeEntity() {

	}

	public EmployeeEntity(String firstName, String lastName, String email, String city, int age, double salary) {
		super();
		this.emp_id = emp_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.age = age;
		this.salary = salary;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [emp_id=" + emp_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", city=" + city + ", age=" + age + ", salary=" + salary + "]";
	}

}

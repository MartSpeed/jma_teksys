package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // letting it know its an entity that will be an object
@Table // the type of object we are telling it to be
public class TeacherEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// ***fields START***

	@Id // primary key = @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private String salary;
	private String teacherName;
	// ***fields END***

	// Associations
	// FOREIGN KEY - departmentEntity is the foreign key
	// this is telling it how to map to the DB
	//@ManyToOne
	// joining the Id
	//@JoinColumn(name="fkey_dept")
	//private DepartmentEntity departmentEntity; 

	// DEFAULT CONSTRUCTOR
	public TeacherEntity() {

	}

//	public TeacherEntity(int teacherId, String salary, String teacherName, DepartmentEntity departmentEntity) {
//		this.teacherId = teacherId;
//		this.salary = salary;
//		this.teacherName = teacherName;
//		this.departmentEntity = departmentEntity;
//	}
	
	public TeacherEntity(int teacherId, String salary, String teacherName) {
		this.teacherId = teacherId;
		this.salary = salary;
		this.teacherName = teacherName;
	}

	// ***GETTERS/SETTERS START***

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

//	public DepartmentEntity getDepartmentEntity() {
//		return departmentEntity;
//	}
//
//	public void setDepartmentEntity(DepartmentEntity departmentEntity) {
//		this.departmentEntity = departmentEntity;
//	}
	// ***GETTERS/SETTERS END***

}

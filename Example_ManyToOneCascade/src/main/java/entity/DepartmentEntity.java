package entity;

// this is what makes it an entity and connecting it to a DB
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

// tell our object that its a table
@Entity
@Table

public class DepartmentEntity implements Serializable {
	// turn this into an object
	@Id
	// add a generated value
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	
	// target anything on the one to many relationship
	@OneToMany(targetEntity = TeacherEntity.class, cascade = {CascadeType.ALL})
	// we need to give one to many a net target
	private List teacherList; // TEACHERLIST FIELD 
	
	// DEFAULT CONSTRUCTOR
	public DepartmentEntity() {
		// this code is what calls or starts the class at 1, default
	}
	// all args constructor
	public DepartmentEntity(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	// getters/setters
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}
	

}

package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="Student")
public class studentEntity {
	@Column(name = "email") // column name PK

	@Id
	private String sEmail;

	// FIELD NAMES
	private String sName, sPass;
	private List sCourses;

	// CONSTRUCTORS
	public studentEntity() {
	}

	public studentEntity(String sEmail, String sName, String sPass, List sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	// GETTERS/SETTERS
	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List getsCourses() {
		return sCourses;
	}

	public void setsCourses(List sCourses) {
		this.sCourses = sCourses;
	}

	// TOSTRING METHOD
	@Override
	public String toString() {
		return "studentEntity [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses
				+ "]";
	}

}

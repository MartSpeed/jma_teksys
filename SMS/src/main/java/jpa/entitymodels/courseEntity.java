package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")
public class courseEntity {
	@Column(name = "courseId") // column name PK

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;

	// FIELDS
	private String cName, cInstructorsName;

	// CONSTRUCTORS
	public courseEntity() {
	}

	public courseEntity(int cId, String cName, String cInstructorsName) {
		this.cId = cId;
		this.cName = cName;
		this.cInstructorsName = cInstructorsName;
	}

	// GETTERS/SETTERS
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorsName() {
		return cInstructorsName;
	}

	public void setcInstructorsName(String cInstructorsName) {
		this.cInstructorsName = cInstructorsName;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "courseEntity [cId=" + cId + ", cName=" + cName + ", cInstructorsName=" + cInstructorsName + "]";
	}

}

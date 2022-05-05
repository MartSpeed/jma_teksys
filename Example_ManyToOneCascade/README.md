# Hibernate Settings

## Set Up:

- [x] fields
  - [x] primary key = @Id
  - [x] Object = @Entity
- [x] table identifier
- [x] import persistence dependencies

```
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // letting it know its an entity that will be a table object
@Table // the tye of object we are telling it to be
public class TeacherEntity {

  // ***fields START***
	@Id  //primary key = @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int teacherId;
	private String salary;
	private String teacherName;
}
```

---

# CONSTRUCTORS

```
// DEFAULT CONSTRUCTOR
	public TeacherEntity() {

	}

	public TeacherEntity(int teacherId, String salary, String teacherName, DepartmentEntity departmentEntity) {
		this.teacherId = teacherId;
		this.salary = salary;
		this.teacherName = teacherName;
		this.departmentEntity = departmentEntity;
	}
```

# GETTERS AND SETTERS

```
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

	public DepartmentEntity getDepartmentEntity() {
		return departmentEntity;
	}

	public void setDepartmentEntity(DepartmentEntity departmentEntity) {
		this.departmentEntity = departmentEntity;
	}
	// ***GETTERS/SETTERS END***
```

---

# SETTING THE JOIN TYPE & CREATING THE FOREIGN KEY

```
// Associations

	// FOREIGN KEY - departmentEntity is the foreign key
	// this is telling it how to map to the DB
	@ManyToOne

	// joining the Id
	@JoinColumn(name="fkey_dept")

  // creating the foreign key or (fk_dept) OR (fkey_dept)
	private DepartmentEntity departmentEntity;
```

---

# CREATING THE HIBERNATE.CFG.XML FILE

> NOTE: _this is where we tell our class where to find the database table we are using or will be using_

> NOTE: _DO NOT FORGET TO REMOVE YOUR PASSWORD WHEN USING ACTUALLY DB AND CHANGE YOUR DB LOCATION_

> NOTE: _ADD ALL ENTITIES IN THE MAP SECTION_

```{admonition} Click the button to reveal! :class:dropdown

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 5.3//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-5.3.dtd">
<hibernate-configuration>
	<session-factory>
		<!-- Drop and re-create the database schema on startup -->
		<property name="hibernate.hbm2ddl.auto"> update </property>
		<!-- Database connection settings -->
		<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="connection.url">jdbc:mysql://localhost:3306/departmentdb</property>
		<property name="connection.username">root</property>
		<property name="connection.password">********</property>
		<!-- Maria DB dialect -->
		<property name="dialect">org.hibernate.dialect.MariaDB53Dialect</property>
		<!-- Echo all executed SQL to stdout -->
		<property name="hibernate.show_sql">true </property>
		<property name="hibernate.format_sql">true </property>

    	<!-- Mapping entity file -->
    	<!-- NOTE BE SURE TO ADD ALL CLASSES THAT WILL BE ACCESSED OR USED -->
    	<mapping class="entity.DepartmentEntity" />
    	<mapping class="entity.TeacherEntity" />

    </session-factory>

</hibernate-configuration>
```

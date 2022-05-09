Hibernate Project

- [x] create project
- [x] create dependencies
- [x] create the package "com.test.hib.model” under the main->src->java
  - [x] Create an entity class named “UserEntity.java” under the above package.

# ADD CODE BELOW TO CREATE USER ENTITY

```
// FIELDS
	private Integer id;
	private String fullname;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;

	// GETTERS/SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
```

# map this model class to the user table in the database

```
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class UserEntity {

	// FIELDS
	private Integer id;
	private String fullname;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;

	// CONSTRUCTORS
	public UserEntity() {

	}

	public UserEntity(String fullname, String email, String password, int age, double salary, String city, Integer id) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	// GETTERS/SETTERS
	@Column(name = "USER_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;

```

# CREATE THE CONFIGURATION FILE

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 5.3//EN"
        "http://www.hibernate.org/dtd/hibernate-configuration-5.3.dtd">
<hibernate-configuration>
    <session-factory>
    <!-- Drop and re-create the database schema on startup -->
    <property name="hibernate.hbm2ddl.auto"> update </property>
    <!-- Database connection settings -->
<property name="connection.driver_class">org.mariadb.jdbc.Driver</property>
<property name="connection.url">jdbc:mysql://localhost:3306/usersdb</property>
<property name="connection.username">root</property>
<property name="connection.password">password</property>
    <!-- Maria DB dialect -->
<property name="dialect">org.hibernate.dialect.MariaDB53Dialect</property>
  <!-- Echo all executed SQL to stdout -->
   <property name="hibernate.show_sql" >true </property>
   <property name="hibernate.format_sql" >true </property>

   <!--   Mapping entity file -->
   <mapping class="com.test.hib.model.User"/>

    </session-factory>
</hibernate-configuration>
```

# DEVELOP CRUD OPERATIONS

- [x] create package com.test.hib.controller
  - [x] create classes in this package
    - [x] CreateUserTable.java
    - [x] CreatingUser.java
    - [x] FindingUser.java
    - [x] UpdatingUser.java
    - [x] DeletingUser.java

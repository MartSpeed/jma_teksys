# **GOAL**

Your task is to create a basic School Management System where students can register for courses, and view the course assigned to them.

_Work-Flow_:

- [] Only students with the right credentials can log in. Otherwise, a message is displayed stating: “Wrong Credentials”.

- [] Valid students are able to see the courses they are registered for.
  Valid students are able to register for any course in the system as long as they are not already registered.

## Requirement 1 & 2

- [x] name the project SMS using [Spring Boot](https://start.spring.io/)
- [x] create database name SMS
- [x] change the mapping and password for hibernate.cfg.xml file
- [x] create jpa.entitymodels package
- [x] add studentEntity class
- [x] add courseEntity class

- ### STUDENT TABLE

  - [x] String sEmail (PK)
  - [x] String sName
  - [x] String sPass
  - [x] List sCourses
  - [x] create student getters/setters
  - [x] create student constructors with args
  - [x] create student initializer constructor
  - [x] create student ToString arg
    > Every Model class must contain the following general two requirements:
    > The first constructor takes no parameters and initializes every member to an initial value.
    > The second constructor must initialize every private member with a parameter provided to the constructor.

- ### COURSE TABLE
  - [x] Integer cId (PK)
  - [x] String cName
  - [x] String cInstructorName
  - [x] create course getters/setters
  - [x] create course constructors with args
  - [x] create course initializer constructor
  - [x] create course ToString arg
  - > Every Model class must contain the following general two requirements:
    > The first constructor takes no parameters and initializes every member to an initial value.
    > The second constructor must initialize every private member with a parameter provided to the constructor.

## Requirement 3

### Student DAO

- [] create package jpa.dao
- [] create class interface StudentDAO
  > This interface is going to have the following method declarations. Please include the proper method signature based on the **Service** table
  - [] getAllStudents();
  - [] getStudentByEmail();
  - [] validateStudent();
  - [] registerStudentToCourse();
  - [] getStudentCourses();

### CourseDAO

- [] create class interface CourseDAO
  - [] getAllCourses();

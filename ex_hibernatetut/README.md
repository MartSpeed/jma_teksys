# Hibernate Tut

## Intro Hibernate and Object Relational Mapping

- [] mapping member variables to columns
  - @Columns???
- [] mapping relationships
  - @OneToMany???
  - Primary Key (PK)???
  - Foreign Key (FK)???
- [] Handling Data Types
- [] Managing changes to object state

## Saving Without Hibernate

- JDBC Database Configuration
- The Model Object (the object that we want to save Employee Object etc)
- Service method to create the model object
- Database Design
- DAO method to save the object using the SQL queries

## Saving With Hibernate

- 1. JDBC Database Configuration - HQL cfg.xml
- 2. The Model Object - Annotation (needs to know what to be save and how to be saved)
- 3. Service method to create the model object - use the HQL API
- Database Design - NOT NEEDED (HQL will create the tables themselves)
- DAO method to save the object using SQL queries - NOT NEEDED

- [] create the Hibernate cfg.xml file

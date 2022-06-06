###### Monday June 6, 2022

# AC10 Spring Boot JPA Hibernate CRUD API Project

# PROJECT SETUP

- [x] create spring project using spring initializer adding the following dependencies
  - [x] mysql driver
  - [x] spring boot dev tools
  - [x] lombok
  - [x] spring web
  - [x] spring data jpa
  - [x] jdbc api
  - [x] dependencies; pom.xml configuration
  - [x] driver; application.properties configuration

# POM.XML DEPENDENCY

```
<dependencies>
   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-data-jpa</artifactId>
   </dependency>

   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-jdbc</artifactId>
   </dependency>

   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
   </dependency>


   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-devtools</artifactId>
     <scope>runtime</scope>
     <optional>true</optional>
   </dependency>

   <dependency>
     <groupId>org.mariadb.jdbc</groupId>
     <artifactId>mariadb-java-client</artifactId>
     <scope>runtime</scope>
   </dependency>

   <dependency>
     <groupId>org.projectlombok</groupId>
     <artifactId>lombok</artifactId>
     <optional>true</optional>
   </dependency>

   <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-test</artifactId>
     <scope>test</scope>
   </dependency>

 </dependencies>
```

# CONFIGURE SPRING DATASOURCE, JPA, HIBERNATE

##### APPLICATION.PROPERTIES CONFIGURATION

```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/jma_springcrud?createDatabaseIfNotExist=true&serverTimezone=America/Chicago&useSSL=false
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update
```

# ENTITY SETUP

- [] create a package name model
  - [] in the model package create the Tutorial.java class

### FIELDS

- [] MODEL ENTITY
  - [x] @Entity
  - [x] @Table(name="tutorials")
  - [x] @Id
  - [x] @GeneratedValue(strategy=GenerationType.IDENTITY)
  - [x] @Column(name="id") is this standard practice or needed since it will by named the variable name by default???
  - [x] private int model_id;
  - [x] @Column(name="title")
  - [x] private String model_title;
  - [x] @Column(name="description")
  - [x] @Size(min = 50) I need to review if this is the correct way to use this annotation again
  - [x] private String model_description;
  - [x] @Column(name="published")
  - [x] private boolean model_published = true;
  - [x] @Data
  - [x] @AllArgsConstructor
    - [x] getters/setters
    - [x] toString
    - [x] no args/all args constructor

# REPOSITORY SETUP

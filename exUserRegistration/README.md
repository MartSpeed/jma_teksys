##### Wednesday June 8, 2022

# Spring Security

### Develop a **USER REGISTRATION MODULE** using role-based Spring security,which can be used in any Spring-based project

## CREATE PROJECT

- [x] spring web
- [x] spring security
- [x] thymeleaf
- [x] mariadb driver
- [x] mysql driver
- [x] spring data jpa
- [x] cloud bootstrap
- [x] spring boot dev tools

## POM.XML MAV DEPENDENCIES

```
<!-- https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils-->
<dependency>
  <groupId>commons-beanutils</groupId>
  <artifactId>commons-beanutils</artifactId>
  <version>1.9.3</version>
</dependency>


<!-- bootstrap and jquery -->
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>bootstrap</artifactId>
  <version>3.3.7</version>
</dependency>
<dependency>
  <groupId>org.webjars</groupId>
  <artifactId>jquery</artifactId>
  <version>3.2.1</version>
</dependency>
```

## CONFIGURE MYSQL AND JPA HIBERNATE

```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/AnewDB?createDatabaseIfNotExist=true&serverTimezone=America/Chicago&useSSL=false
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update
```

## CREATE JPA ENTITIES

- [x] user entity
- [x] role entity

## CREATE REPOSITORY

- [x] userRepository

> # **APP RUNS SUCCESSFULLY**

# SPRING SECURITY CONFIGURATION

we secure our app using **SPRING SECURITY FORM AUTHENTICATION**

- [] create SecurityConfiguration class

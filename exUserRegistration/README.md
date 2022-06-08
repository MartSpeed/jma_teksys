##### Wednesday June 8, 2022

# Spring Security

### Develop a **USER REGISTRATION MODULE** using role-based Spring security,which can be used in any Spring-based project

## CREATE PROJECT

- spring web
- spring security
- thymeleaf
- mariadb driver
- mysql driver
- spring data jpa
- cloud bootstrap
- spring boot dev tools

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

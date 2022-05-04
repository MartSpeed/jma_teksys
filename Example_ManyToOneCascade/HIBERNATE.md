# HIBERNATE _Object Relational Mapping_ MAPPING TOOLS

# Slides to study

- slide 5

---

### project notes:

- when making a class, start uppercase
- when making a package, use lowercase
- add the correct dependencies for you system

---

## MariaDB Dependencies _inside pom.xml file_

```
<dependency>
  <groupId>org.mariadb.jdbc</groupId>
  <artifactId>mariadb-java-client</artifactId>
  <version>3.0.4</version>
</dependency>
```

---

## mysql dependencies _inside pmx.xml file_

```
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>8.0.26</version>
</dependency>
```

---

## if you do _NOT_ have hibernate (HQL)

```
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-annotations</artifactId>
    <version>3.5.5-Final</version>
</dependency>
```

---

# Hibernate

### one - to - one

### one - to - many

### many - to - one

### many - to - many

---

# Cascading

  <p>
  Cascading is
  </p>

- entity relationships
- identify the primary key
- identify foreign key
- how to connect foreign key
- hibernate mapping

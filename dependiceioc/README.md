###### 20220601

# Dependency Injection (DI) + Inversion of Control (IoC)

- [] <bean></bean>
- [] setterinjection.xml file
- [] dependency injection
- [] @Qualifier("itemRepo")
- [] loosely coupled
- [] tightly coupled

###### 20220602

# JAVA MANAGEMENT PROJECT

[Spring Initializer](start.spring.io)

#### DEPENDENCIES

- MySQL Driver
- Spring Data JPA
- Spring Web
- Spring Boot Dev Tools
- Validation
- Spring Session
- Entity Package
- Repository Package (Interface)
- Controller package
- Service Package (Interface, ServiceImpl)
  - User class
  - @Size(min = 15) spring annotation
  - getters/setters
  - empty/all args constructor
- what are pagination and sorting inside of the JpaRepository method
- List
- @Query
- JpaRepository
- CrudRepository
- @Controller
- Model
- @GetMapping(value="/homepage")
- @RequestMapping(value="/")
- @PostMapping(value="/add-homepage")
- @Valid
- BindingResult
- ModelMap
- Optional
- @Service
- userService & userServiceImpl???? need more explanation or implementation
- .isPresent()
- .delete()
- .get()
- model.addAllAttributes()
- model.addAttributes()
- thymeleaf
  - <tr th:if="${#lists.isEmpty(userEntity)}"></tr> (thymeleaf if statement)
  - <td colspan="7"></td>
  - <td th:text="${userEntity.username}"></td> (thymeleaf text)
  - <tr th:each="userEntity : ${userEntity}"> (thymeleaf for each loop)

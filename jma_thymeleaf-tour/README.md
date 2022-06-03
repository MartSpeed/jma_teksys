##### FRIDAY JUNE 03, 2022 @ 1100 HRS

### author: **John Anthony**

# CREATE A SPRINGBOOT APPLICATION

- [x] create zip file using [Spring Initializer](start.spring.io)
- [x] add springboot dependency to pom.xml file

  ```
  <dependency>
  		<groupId>org.springframework.boot</groupId>
  		<artifactId>spring-boot-starter-data-jpa</artifactId>
  	</dependency>
  ```

- [x] define a controller
  - [x] create package mycontroller
  - [x] create a class HomeController
    > HOMECONTROLLER CLASS

```
@Controller
public class HomeController{
  // GET METHOD with the endpoint: showflowerList
  @GetMapping("/showflowerList)
  public String sendDataToHtml(Model model) {
    // collection of flowers
    String[] flowers = new String[] {"Rose","Lily","Tulip","Carnation","Hyacinth"};
    // collection of cities
    String[] City = new String[] {"nyc","nj","dallas","chicago","philadelphia"};
    //
    model.addAttribute("flowersVariable", flowers);
    model.addAttribute("CityVariable", City);
    return "viewFlowers;
  }
}
```

- [x] set localhost:8080 to create showflowerList DB

---

# CREATING A THYMELEAF TEMPLATE

- [x] create viewFlower.html file

```
<!DOCTYPE html>
<html xmls:th="http://www/thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<table style="boder: 1px solid black">
<tr th:each="showflowers: ${flowersVariable}">
  <td th:text="${showflowers}"/>
</tr>
</table>
</body>
</html>
```

> COMPLETED HTML FILE WITH FLOWERS AND CITIES

```
<!DOCTYPE html>
<html xmls:th="http://www/thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
</head>
<body>
<table style="border: 1px solid black">
  <tr th:each="showflowers: ${flowersVariable}">
    <td th:text="${showflowers}"/>
  </tr>
  </tr>
</table>

<table style="border: 1px solid black">
  <tr th:each="showcities: ${CityVariable}">
    <td th:text="${showcities}"/>
  </tr>
</table>
</body>
</html>
```

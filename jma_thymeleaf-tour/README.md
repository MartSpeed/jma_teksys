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

- [] define a controller
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

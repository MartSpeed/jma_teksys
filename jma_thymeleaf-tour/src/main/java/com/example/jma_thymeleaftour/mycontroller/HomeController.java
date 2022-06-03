package com.example.jma_thymeleaftour.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // GET METHOD with the endpoint: showflowerList
    @GetMapping("/showflowerList")
            public String sendDataToHtml(Model model) {

            // collection of flowers
            String[] flowers = new String[] {"Rose","Lily","Tulip","Carnation","Hyacinth"};

            // collection of cities
            String[] City = new String[] {"nyc","nj","dallas","chicago","philadelphia"};

            // models collect and add attributes
            model.addAttribute("flowersVariable", flowers);
            model.addAttribute("CityVariable", City);
            return "viewFlowers";
}
}

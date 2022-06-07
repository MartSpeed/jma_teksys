package com.example.ex_springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
    MVC configuration helping out with the view controller
    identify our routes, through our controller
*/

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    // helps with navigating out routes, controlling our routes
    // still require permission to use these routes
    public void addViewControllers(ViewControllerRegistry registry){
        // identifying the route and setting the view name to path home
        registry.addViewController("/home").setViewName("home");

        //
        registry.addViewController("/").setViewName("home");

        // hello path
        registry.addViewController("/hello").setViewName("hello");

        // login

    }
}

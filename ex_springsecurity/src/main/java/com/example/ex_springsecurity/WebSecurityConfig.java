package com.example.ex_springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/*
 configure our class to authenticate our users to use our classes or reroute them
 */
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    // protected method
    // not returning anything
    // configuring HTTP routes
    // if anything happens in this file, we will throw and exception
    protected void configure(HttpSecurity http) throws Exception{
        // ROUTES SETUP START
        // anyone can go to this path using permitAll() method
        http.authorizeRequests()
            .antMatchers("/","/home").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("login")
            .permitAll()
            .and()
            .logout()
            .permitAll();
    }

    // we want to override a user detail service
    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        //
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        // use internal memory
        return new InMemoryUserDetailsManager(user);
    }
}

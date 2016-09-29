package com.example.democrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * This Spring Security configuration uses in-memory predefined list 
 * TODO read user list from MongoDB
 * 
 * 
 * @author Paul
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}

	// TODO configure CSRF (Cross Site Request Forgery) protection  instead of disabling it
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
	}
}

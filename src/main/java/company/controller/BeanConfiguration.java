package company.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import company.beans.School;
import company.beans.Student;

/**
 * Arda Rugji - arugji
 *  CIS171 
 * 1 April
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	Student student() {
		Student bean = new Student("Arda","Rugji");
		return bean;
	}
	
	@Bean 
	School school() {
		School bean = new School(1,"Student");
		return bean;
	}
}

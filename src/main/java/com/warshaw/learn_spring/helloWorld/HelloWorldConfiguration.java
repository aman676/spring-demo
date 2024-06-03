package com.warshaw.learn_spring.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };

@Configuration
public class HelloWorldConfiguration {
		
		@Bean
		public String name() {
			return "aman";
		}
		
		@Bean
		public int age() {
			return 15;
		}
		
		@Bean
		public Person person() {
			return new Person("Ankit",99);
		}
}

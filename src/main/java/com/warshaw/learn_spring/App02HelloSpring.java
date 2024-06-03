package com.warshaw.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.warshaw.learn_spring.helloWorld.HelloWorldConfiguration;

public class App02HelloSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("person"));
	}

}

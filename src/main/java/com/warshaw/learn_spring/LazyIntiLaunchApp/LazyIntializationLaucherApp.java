package com.warshaw.learn_spring.LazyIntiLaunchApp;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A {
	
}

@Component
@Lazy
class B {
	private A cA;
	
	public B(A cA) {
		System.out.println("Some init");
		this.cA = cA; 
	}
	
	public void doSomething() {
		System.out.println("Doing something");
	}
}

@Configuration
@ComponentScan
public class LazyIntializationLaucherApp {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyIntializationLaucherApp.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("context intialized");
			
			context.getBean(B.class).doSomething();
		}

	}

}

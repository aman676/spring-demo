package com.warshaw.learn_spring.PostConsPreDestroy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("all dependecy ready");
	}
	
	@PostConstruct
	public void intialize () {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleanup done");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic running");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationLaunchApp {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationLaunchApp.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}

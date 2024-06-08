package com.warshaw.learn_spring.jakartaCDI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class Service {
	private Dependency dependency;

	public Dependency getDependency() {
		return dependency;
	}
	
	//@Autowired
	@Inject
	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}
	
	
}

@Component
class Dependency {
	
}

@Configuration
@ComponentScan
public class JakartaCDILaunchApp {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(JakartaCDILaunchApp.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}

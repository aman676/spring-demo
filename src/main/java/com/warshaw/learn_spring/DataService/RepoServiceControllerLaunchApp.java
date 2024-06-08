package com.warshaw.learn_spring.DataService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;

@Configuration
@ComponentScan
public class RepoServiceControllerLaunchApp {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(RepoServiceControllerLaunchApp.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findmax());
			
		}

	}

}

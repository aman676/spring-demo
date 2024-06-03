package com.warshaw.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;

public class App03GamingSpringBean {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GameConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}

	}

}

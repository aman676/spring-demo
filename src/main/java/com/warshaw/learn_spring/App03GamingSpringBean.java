package com.warshaw.learn_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;

@Configuration
@ComponentScan("com.warshaw.learn_spring.game")
public class App03GamingSpringBean {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(App03GamingSpringBean.class)){
			context.getBean(GameConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}

	}

}

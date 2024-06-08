package com.warshaw.learn_spring.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;

@Component
class NormalClass {
	
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
	
}

@Configuration
@ComponentScan
public class BeanScopeLaunchApp {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(BeanScopeLaunchApp.class)){
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
		}

	}

}

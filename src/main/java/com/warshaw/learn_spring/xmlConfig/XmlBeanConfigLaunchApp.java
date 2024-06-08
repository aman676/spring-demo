package com.warshaw.learn_spring.xmlConfig;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.warshaw.learn_spring.game.GameRunner;

public class XmlBeanConfigLaunchApp {

	public static void main(String[] args) {
		
		try(var context = new ClassPathXmlApplicationContext("contextConfig.xml")){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class);
			
			System.out.println(context.getBean("game"));
			
			context.getBean(GameRunner.class).run();
		}

	}

}

package com.warshaw.learn_spring.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass {
	
	@Autowired
	Dependency1 dependency1;	
	@Autowired
	Dependency2 dependency2;
		
//	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
//		super();
//		this.dependency1 = dependency1;
//		this.dependency2 = dependency2;
//	}
//	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
//	
	@Override
	public String toString() {
		return "BusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}	
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}

@Configuration
@ComponentScan
public class DependencyInjectionLaucherApp {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLaucherApp.class)){
			System.out.println(context.getBean(BusinessClass.class));
		}

	}

}

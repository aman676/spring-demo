package com.warshaw.learn_spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole{
	
	public void up() {
		System.out.println("Go up");
	}
	
	public void down() {
		System.out.println("Go down");
	}
	
	public void left() {
		System.out.println("Go left");
	}
	
	public void right() {
		System.out.println("Go right");
	}
}

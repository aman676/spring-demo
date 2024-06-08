package com.warshaw.learn_spring.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.warshaw.learn_spring.game.GameConsole;
import com.warshaw.learn_spring.game.GameRunner;
import com.warshaw.learn_spring.game.PacmanGame;

@Configuration
public class GamingConfiguration { //No need of configuration class as added component and component scan

	@Bean
	@Primary
	public GameConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	@Qualifier("gameQua")
	public GameConsole game2() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	@Primary
	public GameRunner gameRunner(GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	@Bean(name = "gameRunner2")
	public GameRunner gameRunnerr() {
		var gameRunner = new GameRunner(game());
		return gameRunner;
	}
	
	@Bean(name = "gameRunner3")
	public GameRunner gameRunner3(@Qualifier("gameQua") GameConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}

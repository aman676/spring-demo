package com.warshaw.learn_spring.helloWorld;

import com.warshaw.learn_spring.game.GameRunner;
import com.warshaw.learn_spring.game.MarioGame;
import com.warshaw.learn_spring.game.PacmanGame;

public class App01GamingMain {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}

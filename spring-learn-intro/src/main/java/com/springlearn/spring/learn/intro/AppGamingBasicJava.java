package com.springlearn.spring.learn.intro;

import com.springlearn.spring.learn.intro.game.GameRunner;
import com.springlearn.spring.learn.intro.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
	}

}

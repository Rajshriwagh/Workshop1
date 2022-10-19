package com.workshopday1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe Program!");
		TicTacToeBoard ticTacToeObject = new TicTacToeBoard();
        ticTacToeObject.ticTacToeBoard();
	}
}

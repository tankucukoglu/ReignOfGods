package states;

import java.awt.Graphics;

import driver.Game;

public abstract class State{
	
	private static State currentState = null;
	
	public static void setState(State state){
		currentState = state;
	}
	public static State getState(){
		return currentState;
	}
	
	protected Game game;
	
	public State(Game cGame){
		game = cGame;
	}
	
	public abstract void update();
	public abstract void render(Graphics g);

}

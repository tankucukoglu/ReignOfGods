package characters;

import graphics.ImageAssets;

import java.awt.Graphics;

import driver.Game;

public class Player extends Creature{
	
	private Game game;
	
	public Player(Game cGame, float xc, float yc){
		
		super(xc, yc, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT); // make them private?
		game = cGame;
	}
	public void update(){
		getInput(); // receive input from user
		move();		// move player according to input
	}	
	public void render(Graphics g){
		g.drawImage(ImageAssets.player[0], (int)x, (int)y, width, height, null);
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().getUp()){
			yMove = -speed;
		}
		if(game.getKeyManager().getDown()){
			yMove = speed;
		}
		if(game.getKeyManager().getLeft()){
			xMove = -speed;
		}
		if(game.getKeyManager().getRight()){
			xMove = speed;
		}
	}
}

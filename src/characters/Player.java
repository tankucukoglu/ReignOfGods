package characters;

import graphics.ImageAssets;

import java.awt.Graphics;

import driver.Game;

public class Player extends Creature{
	
	private final int SPEED = 3;
	private int playerCol, playerRow;
	
	private Game game;
	
	public Player(Game cGame, float xc, float yc){
		super(xc, yc, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT); // make them private?
		game = cGame;
		playerCol = 0;
		playerRow = 2;
	}
	public void update(){
		// prevented diagonal movement
		if(game.getKeyManager().getUp()){
			y -= SPEED;
		}
		else if(game.getKeyManager().getDown()){
			y += SPEED;
		}
		else if(game.getKeyManager().getLeft()){
			x -= SPEED;
		}
		else if(game.getKeyManager().getRight()){
			x += SPEED;
		}
	}	
	public void render(Graphics g){
		g.drawImage(ImageAssets.player[0], (int)x, (int)y, width, height, null);
	}
	
	// setters & getters
	public void setCol(int col){
		playerCol = col;
	}
	public void setRow(int row){
		playerRow = row;
	}
	public int getCol(){
		return playerCol;
	}
	public int getRow(){
		return playerRow;
	}

}

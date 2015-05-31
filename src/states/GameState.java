package states;

import graphics.ImageAssets;

import java.awt.Graphics;

import characters.Player;
import driver.Game;

public class GameState extends State{
	
	private Player player;
	
	public GameState(Game cGame){
		super(cGame);
		player = new Player(cGame, 50, 50);
	}

	public void update(){
		player.update();
	}

	public void render(Graphics g){
		g.drawImage(ImageAssets.grass[0], 0, 0, null);
		player.render(g);
	}

}

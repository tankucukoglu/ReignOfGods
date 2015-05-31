package states;

import graphics.ImageAssets;

import java.awt.Graphics;

public class GameState extends State{
	
	public GameState(){
		
	}

	public void update(){
		
	}

	public void render(Graphics g){
		g.drawImage(ImageAssets.grass[0], 0, 0, null);
	}

}

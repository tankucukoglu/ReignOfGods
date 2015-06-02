package graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile{
	
	public static final int TILE_WIDTH = 32, TILE_HEIGHT = 32; // private?
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage cTexture, int cId){
		texture = cTexture;
		id = cId;
	}
	
	public void update(){
		
	}
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILE_WIDTH, TILE_HEIGHT, null);
	}
	public boolean isSolid(){
		return false;
	}
	public int getId(){
		return id;
	}

}

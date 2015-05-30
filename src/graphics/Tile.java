package graphics;

import java.awt.Graphics;

import management.ImageManager;

public abstract class Tile{
	
	protected ImageManager imageManager;
	
	public Tile(ImageManager im){
		imageManager = im;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g, int x, int y);
	
}
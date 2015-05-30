package graphics;

import java.awt.Graphics;

import driver.Driver;
import management.ImageManager;

public class GrassTile extends Tile{

	public GrassTile(ImageManager im) {
		super(im);
		
	}

	public void tick() {
		
	}
	public void render(Graphics g, int x, int y) {
		g.drawImage(imageManager.getGrassTiles(), x, y, 
				Driver.getTilesize() * Driver.getScale(), Driver.getTilesize() * Driver.getScale(), null);
	}

}

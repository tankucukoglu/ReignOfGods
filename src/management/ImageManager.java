package management;

import java.awt.image.BufferedImage;

public class ImageManager{
	
	private BufferedImage grassTiles;
	
	public ImageManager(SpriteManager sm){
		//tiles = sm.crop(0, 2, 32, 36);
	}
	
	public void setGrassTiles(BufferedImage gt){
		grassTiles = gt;
	}
	public BufferedImage getGrassTiles(){
		return grassTiles;
	}
}
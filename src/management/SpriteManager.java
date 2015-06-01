package management;

import java.awt.image.BufferedImage;

public class SpriteManager{
	
	private BufferedImage sheet;
	
	public SpriteManager(BufferedImage spriteSheet){
		sheet = spriteSheet;
	}
	
	public BufferedImage crop(int col, int row, int w, int h){
		return sheet.getSubimage(col * w, row * h, w, h); // select tile according to column, row, width, height
	}
}
package graphics;

import java.awt.image.BufferedImage;

public class SpriteManage{
	
	private BufferedImage sheet;
	
	public SpriteManage (BufferedImage spriteSheet){
		sheet = spriteSheet;
	}
	
	public BufferedImage crop(int col, int row, int w, int h){
		return sheet.getSubimage(col * w, row * h, w, h);
	}
}
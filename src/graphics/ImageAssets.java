package graphics;

import java.awt.image.BufferedImage;

import management.SpriteManager;

public class ImageAssets{
	
	private final int WIDTH = 32, HEIGHT = 32;
	
	private BufferedImage[] desert, dirt, grass, mud, road, snow, tree, water;
	
	public ImageAssets(){
		
		desert = new BufferedImage[35];
		dirt = new BufferedImage[35];
		grass = new BufferedImage[35];
		mud = new BufferedImage[35];
		road = new BufferedImage[35];
		snow = new BufferedImage[35];
		tree = new BufferedImage[35];
		water = new BufferedImage[35];
	}
	
	public void init(){
		
		ImageLoader loader = new ImageLoader();
		
		// iterate with spritemanager		
	}

}

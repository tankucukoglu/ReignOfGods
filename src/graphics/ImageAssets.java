package graphics;

import java.awt.image.BufferedImage;

import management.SpriteManager;

public class ImageAssets{
	
	private static final int WIDTH = 32, HEIGHT = 32;
	
	public static BufferedImage[] desert, dirt, grass, mud, road, snow, tree, water;
	public static BufferedImage[] player;
	public static BufferedImage rock;
	
	public static void init(){
		
		ImageLoader loader = new ImageLoader();
		SpriteManager grassSheet = new SpriteManager(loader.loadImage("res/images/environment_tilesets/grass.png"));
		SpriteManager playerSheet = new SpriteManager(loader.loadImage("res/images/warrior_m.png"));
		
		desert = new BufferedImage[35];
		dirt = new BufferedImage[35];
		grass = new BufferedImage[12];
		int i = 0;
		for(int y = 0; y < 4; y++){
			for(int x = 0; x < 3; x++){
				grass[i] = grassSheet.crop(x, y, WIDTH, HEIGHT);
				i++;
			}
		}
		mud = new BufferedImage[35];
		road = new BufferedImage[35];
		snow = new BufferedImage[35];
		tree = new BufferedImage[35];
		water = new BufferedImage[35];
		
		player = new BufferedImage[12];
		int k = 0;
		for(int y = 0; y < 4; y++){
			for(int x = 0; x < 3; x++){
				player[k] = playerSheet.crop(x, y, 32, 36);
				k++;
			}
		}
		
	}
}

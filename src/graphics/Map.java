package graphics;

import java.awt.image.BufferedImage;

public class Map{
	
	private int[][] tiles; 
	
	public Map(BufferedImage mapImage){
		loadMap(mapImage);
	}
	
	public void loadMap(BufferedImage mi){
		tiles = new int[mi.getWidth()][mi.getHeight()];
		
		for(int y = 0; y < mi.getHeight(); y++){
			for(int x = 0; x < mi.getWidth(); x++){
				
			}
		}
	}

}

package characters;

import management.SpriteManager;
import driver.Driver;

import java.awt.Graphics;

public class Character{
	
	private int x, y;
	private SpriteManager sm;
	private boolean up = false, down = false, left = false, right = false;
	private final int SPEED = 3;
	private int playerCol, playerRow;
	
	public Character(int xc, int yc, SpriteManager spriteManager){
		x = xc;
		y = yc;
		sm = spriteManager;
		playerCol = 0;
		playerRow = 2;
	}
	
	public void tick(){
		
		// prevented diagonal movement
		if(up){
			y -= SPEED;
		}
		else if(down){
			y += SPEED;
		}
		else if(left){
			x -= SPEED;
		}
		else if(right){
			x += SPEED;
		}
	}
	public void render(Graphics g){
		g.drawImage(sm.crop(playerCol, playerRow, 32, 36), x, y, 
				Driver.getTilesize() * Driver.getScale(), Driver.getTilesize() * Driver.getScale(), null);
	}
	
	public void setUp(boolean u){
		up = u;
	}
	public void setDown(boolean d){
		down = d;
	}
	public void setLeft(boolean l){
		left = l;
	}
	public void setRight(boolean r){
		right = r;
	}
	public void setCol(int col){
		playerCol = col;
	}
	public void setRow(int row){
		playerRow = row;
	}
	
}

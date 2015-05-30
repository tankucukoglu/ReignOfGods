package characters;

import graphics.SpriteManage;
import driver.Driver;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Character implements KeyListener{
	
	private int x, y;
	private SpriteManage sm;
	private boolean up = false, down = false, left = false, right = false;
	private final int SPEED = 3;
	private int playerCol, playerRow;
	
	public Character(int xc, int yc, SpriteManage spriteManager){
		x = xc;
		y = yc;
		sm = spriteManager;
		playerCol = 0;
		playerRow = 0;
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
		g.drawImage(sm.crop(playerCol, playerRow, 32, 36), x, y, 16 * Driver.SCALE, 16 * Driver.SCALE, null);
	}

	public void keyPressed(KeyEvent e){
		
		// implement WASD
		if(e.getKeyCode() == KeyEvent.VK_UP){
			up = true;
			playerCol = 0;
			playerRow = 0;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			down = true;
			playerCol = 0;
			playerRow = 2;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			left = true;
			playerCol = 0;
			playerRow = 3;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			right = true;
			playerCol = 0;
			playerRow = 1;
		}
	}
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			down = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			left = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			right = false;
		}
	}
	public void keyTyped(KeyEvent e){}
}

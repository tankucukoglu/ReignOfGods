package management;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import driver.Driver;

public class KeyManager implements KeyListener{
	
public void keyPressed(KeyEvent e){
		
		// implement WASD
		if(e.getKeyCode() == KeyEvent.VK_UP){
			Driver.getPlayer().setUp(true);
			Driver.getPlayer().setCol(0);
			Driver.getPlayer().setRow(0);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Driver.getPlayer().setDown(true);
			Driver.getPlayer().setCol(0);
			Driver.getPlayer().setRow(2);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Driver.getPlayer().setLeft(true);
			Driver.getPlayer().setCol(0);
			Driver.getPlayer().setRow(3);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			Driver.getPlayer().setRight(true);
			Driver.getPlayer().setCol(0);
			Driver.getPlayer().setRow(1);
		}
	}
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP){
			Driver.getPlayer().setUp(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Driver.getPlayer().setDown(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			Driver.getPlayer().setLeft(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			Driver.getPlayer().setRight(false);
		}
	}
	public void keyTyped(KeyEvent e){}

}

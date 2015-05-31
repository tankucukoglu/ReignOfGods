package management;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	
	private boolean[] keys;
	private boolean up, down, left, right;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void update(){
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
	}	
	public void keyPressed(KeyEvent e){
		keys[e.getKeyCode()] = true;
	}
	public void keyReleased(KeyEvent e){
		keys[e.getKeyCode()] = false;
	}
	public void keyTyped(KeyEvent e){}
	
	public boolean getUp(){
		return up;
	}
	public boolean getDown(){
		return down;
	}
	public boolean getLeft(){
		return left;
	}
	public boolean getRight(){
		return right;
	}

}

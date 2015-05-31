package entities;

import java.awt.Graphics;

public abstract class Entity{
	
	protected float x, y;
	protected int width, height;
	
	public Entity(float xc, float yc, int cWidth, int cHeight){
		x = xc;
		y = yc;
		width = cWidth;
		height = cHeight;
	}
	
	// getters & setters
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setX(float xc) {
		x = xc;
	}
	public void setY(float yc) {
		y = yc;
	}
	public void setWidth(int cWidth) {
		width = cWidth;
	}
	public void setHeight(int cHeight) {
		height = cHeight;
	}	

	public abstract void update();
	public abstract void render(Graphics g);

}

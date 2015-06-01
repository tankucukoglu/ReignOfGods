package characters;

import entities.Entity;

public abstract class Creature extends Entity{
	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 32, DEFAULT_CREATURE_HEIGHT = 32;
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;

	public Creature(float xc, float yc, int cWidth, int cHeight){
		super(xc, yc, cWidth, cHeight);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED; // moving speed
		xMove = 0; // move x coordinate
		yMove = 0; // move y coordinate
	}
	// moves the creature
	public void move(){
		x += xMove;
		y += yMove;
	}
	
	// getters & setters
	public int getHealth() {
		return health;
	}
	public float getSpeed() {
		return speed;
	}
	public float getxMove() {
		return xMove;
	}
	public float getyMove() {
		return yMove;
	}
	public void setSpeed(float cSpeed) {
		speed = cSpeed;
	}
	public void setHealth(int cHealth) {
		health = cHealth;
	}
	public void setxMove(float cxMove) {
		xMove = cxMove;
	}
	public void setyMove(float cyMove) {
		yMove = cyMove;
	}
}

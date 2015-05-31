package characters;

import entities.Entity;

public abstract class Creature extends Entity{
	
	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 32, DEFAULT_CREATURE_HEIGHT = 32;
	
	protected int health;
	protected float speed;

	public Creature(float xc, float yc, int cWidth, int cHeight){
		super(xc, yc, cWidth, cHeight);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
	}

	// getters & setters
	public int getHealth() {
		return health;
	}
	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float cSpeed) {
		speed = cSpeed;
	}
	public void setHealth(int cHealth) {
		health = cHealth;
	}

}

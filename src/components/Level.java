package components;

public class Level{
	private int level;
	private final int MAX_LEVEL;
	
	public Level(){
		level = 0;
		MAX_LEVEL = 100;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int lvl){
		level = lvl;
	}
	public int getMaxLevel(){
		return MAX_LEVEL;
	}
}
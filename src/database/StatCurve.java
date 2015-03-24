package database;

import java.util.ArrayList;

import components.Stat;
import components.Level;

public class StatCurve {
	
	private ArrayList<Stat> statsPerLevel;
	private ArrayList<Level> levelset;
	
	public StatCurve(){
		statsPerLevel = new ArrayList<Stat>();
		levelset = new ArrayList<Level>();
		
		// we'll see if this works...
		loadAir();
		loadEarth();
		loadFire();
		loadLightning();
		loadWater();
	}
	public ArrayList<Stat> getSPL(){
		return statsPerLevel;
	}
	public void setSPL(ArrayList<Stat> spl){
		statsPerLevel = spl;
	}
	public void loadAir(){
		
	}
	public void loadEarth(){
		
	}
	public void loadFire(){
		
	}
	public void loadLightning(){
		
	}
	public void loadWater(){
		
	}
}

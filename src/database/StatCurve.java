package database;

import java.util.ArrayList;

import components.Stat;

public class StatCurve{
	
	private ArrayList<Stat> statsPerLevelAir;
	private ArrayList<Stat> statsPerLevelEarth;
	private ArrayList<Stat> statsPerLevelFire;
	private ArrayList<Stat> statsPerLevelLightning;
	private ArrayList<Stat> statsPerLevelWater;
	
	private final int MAX_LEVEL = 100;
	
	private Stat newStat;
	
	public StatCurve(){
		statsPerLevelAir = new ArrayList<Stat>();
		statsPerLevelEarth = new ArrayList<Stat>();
		statsPerLevelFire = new ArrayList<Stat>();
		statsPerLevelLightning = new ArrayList<Stat>();
		statsPerLevelWater = new ArrayList<Stat>();
		
		newStat = new Stat();
		
	}
	public ArrayList<Stat> loadAir(){
		int x = 1;
		for(int i = 1; i <= MAX_LEVEL; i++){
			// need separate stats
			newStat.setAgi(x);
			newStat.setAtk(x);
			newStat.setDef(x);
			newStat.setHP(x);
			newStat.setMagic(x);
			newStat.setMDef(x);
			newStat.setMP(x);
			statsPerLevelAir.add(newStat);
			x += 2;
		}
		return statsPerLevelAir;
	}
	public ArrayList<Stat> loadEarth(){
		for(int i = 1; i <= MAX_LEVEL; i++){
			
		}
		return statsPerLevelEarth;
	}
	public ArrayList<Stat> loadFire(){
		for(int i = 1; i <= MAX_LEVEL; i++){
			
		}
		return statsPerLevelFire;
	}
	public ArrayList<Stat> loadLightning(){
		for(int i = 1; i <= MAX_LEVEL; i++){
			
		}
		return statsPerLevelLightning;
	}
	public ArrayList<Stat> loadWater(){
		for(int i = 1; i <= MAX_LEVEL; i++){
			
		}
		return statsPerLevelWater;
	}
}

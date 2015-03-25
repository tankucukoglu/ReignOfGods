package database;

import java.util.ArrayList;

import components.Stat;
import characters.Character;

public class StatCurve{
	
	private ArrayList<Stat> statsPerLevelAir;
	private ArrayList<Stat> statsPerLevelEarth;
	private ArrayList<Stat> statsPerLevelFire;
	private ArrayList<Stat> statsPerLevelLightning;
	private ArrayList<Stat> statsPerLevelWater;
	private Character defaultChar;
	
	private Stat newStat;
	
	public StatCurve(){
		statsPerLevelAir = new ArrayList<Stat>();
		statsPerLevelEarth = new ArrayList<Stat>();
		statsPerLevelFire = new ArrayList<Stat>();
		statsPerLevelLightning = new ArrayList<Stat>();
		statsPerLevelWater = new ArrayList<Stat>();
		
		defaultChar = new Character();
		
		newStat = new Stat();
		
		defaultChar.setLevel(100);
		
		// maybe just use int instead of char object?
		
		// we'll see if this works...
		loadAir();
		loadEarth();
		loadFire();
		loadLightning();
		loadWater();
	}
//	public ArrayList<Stat> getSPL(){
//		return statsPerLevel;
//	}
//	public void setSPL(ArrayList<Stat> spl){
//		statsPerLevel = spl;
//	}
	public void loadAir(){
		int x = 1;
		for(int i = 1; i <= defaultChar.getLevel(); i++){
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
	}
	public void loadEarth(){
		for(int i = 1; i <= defaultChar.getLevel(); i++){
			
		}
	}
	public void loadFire(){
		for(int i = 1; i <= defaultChar.getLevel(); i++){
			
		}
	}
	public void loadLightning(){
		for(int i = 1; i <= defaultChar.getLevel(); i++){
			
		}
	}
	public void loadWater(){
		for(int i = 1; i <= defaultChar.getLevel(); i++){
			
		}
	}
}

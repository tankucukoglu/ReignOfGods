package database;

import java.util.ArrayList;

import components.Stat;
import components.Level;

public class StatCurve {
	
	private ArrayList<Stat> statsPerLevel;
	
	public StatCurve(){
		statsPerLevel = new ArrayList<Stat>();
		
		// we'll see if this works...
	}
	public ArrayList<Stat> getSPL(){
		return statsPerLevel;
	}
	public void setSPL(ArrayList<Stat> spl){
		statsPerLevel = spl;
	}
}

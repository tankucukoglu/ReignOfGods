package components;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Skill {
	private String name;
	private String description;
	private String type;
	private String areaOfEffect;
	
	private int mpCost;
	
	private float hitRate;
	
	private double damage;
	
	private ImageIcon icon;
	
	private ArrayList<Skill> skills;
	
	public Skill(){
		loadSkills();
	}
	public void loadSkills(){
		
	}
}

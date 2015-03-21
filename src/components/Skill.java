package components;

import javax.swing.ImageIcon;

public class Skill {
	private String name;
	private String description;
	private String type;
	private int areaOfEffect;
	
	private int mpCost;
	
	private float accuracy;
	
	private double damage;
	
	private ImageIcon icon;
	
	public Skill(){
		name = "";
		description = "";
		type = "";
		areaOfEffect = 0;
		
		mpCost = 0;
		accuracy = 0;
		damage = 0;
		
		icon = null;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public String getDesc(){
		return description;
	}
	public void setDesc(String d){
		description = d;
	}
	public String getType(){
		return type;
	}
	public void setType(String t){
		type = t;		
	}
	public int getAOE(){
		return areaOfEffect;
	}
	public void setAOE(int aoe){
		areaOfEffect = aoe;
	}
	public int getMPCost(){
		return mpCost;
	}
	public void setMPCost(int mp){
		mpCost = mp;
	}
	public float getAccu(){
		return accuracy;
	}
	public void setAccu(float a){
		accuracy = a;
	}
	public double getDmg(){
		return damage;
	}
	public void setDmg(double dmg){
		damage = dmg;
	}
	public ImageIcon getImg(){
		return icon;
	}
	public void setImg(ImageIcon img){
		icon = img;
	}
	
	// Subject to change
	@Override
	public String toString() {
	    return this.getName() + " " + this.getType() + " " + Integer.toString(this.getAOE()) + 
	    		" " + Integer.toString(this.getMPCost()) +  " " + Float.toString(this.getAccu()) + 
	    		" " + Double.toString(this.getDmg());
	}
}
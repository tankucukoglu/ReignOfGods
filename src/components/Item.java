package components;

import javax.swing.ImageIcon;

public class Item{
	
	private String name;	
	private String type; // armor, consumable, weapon
	private String description;
	
	private ImageIcon icon;
	
	public Item(){
		name = "";
		type = "";
		description = "";
		icon = null;
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public String getType(){
		return type;
	}
	public void setType(String t){
		type = t;
	}
	public String getDesc(){
		return description;
	}
	public void setDest(String d){
		description = d;
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
	    return this.getName() + " " + this.getType();
	}

}

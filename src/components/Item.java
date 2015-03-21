package components;

import javax.swing.ImageIcon;

public class Item{
	
	private String type; // armor, consumable, weapon
	
	private String description;
	
	private ImageIcon icon;
	
	public Item(){
		type = "";
		description = "";
		icon = null;
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

}

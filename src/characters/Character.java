package characters;

import javax.swing.ImageIcon;

import components.Element;
import components.Level;
import components.Stat;
import database.ItemCollection;
import database.StatCurve;

public class Character{
	private String name;
	private String gender;
	
	private ImageIcon icon; // maybe?
	
	private Element element;
	
	private ItemCollection inventory; // unique inventories?
	
	private StatCurve statset; // stat curves...

	private Level levels; // ...with levels
	
	public Character(){
		name = "";
		gender = "";
		
		icon = null;
		
		element = null;
		
		inventory = null;
		
		statset = null;
		
		levels = null;
		
		loadCharacter();
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;		
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String g){
		gender = g;
	}
	public Element getElement(){
		return element;
	}
	public void setElement(Element e){
		element = e;
	}
	public ImageIcon getImg(){
		return icon;
	}
	public void setImg(ImageIcon img){
		icon = img;
	}
	public ItemCollection getInventory(){
		return inventory;
	}
	public void setInventory(ItemCollection inv){
		inventory = inv;
	}
	public StatCurve getStats(){
		return statset;
	}
	public void setStats(StatCurve s){
		statset = s;
	}
	public Level getLevel(){
		return levels;
	}
	public void setLevel(Level lvl){
		levels = lvl;
	}
	public void loadCharacter(){
		element = new Element();
		inventory = new ItemCollection();
		statset = new StatCurve();
		levels = new Level();
		
		if(element.getName() == "Air"){
			statset.loadAir();
		}
		else if(element.getName() == "Earth"){
			statset.loadEarth();
		}
		else if(element.getName() == "Fire"){
			statset.loadFire();
		}
		else if(element.getName() == "Lightning"){
			statset.loadLightning();
		}
		else if(element.getName() == "Water"){
			statset.loadWater();
		}
	}
	
}

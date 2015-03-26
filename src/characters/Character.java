package characters;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import components.Element;
import components.Stat;
import database.ItemCollection;
import database.StatCurve;

public class Character{
	private String name;
	private String gender;
	private ImageIcon icon; // maybe?
	
	private Element element;
	private ItemCollection inventory; // unique inventories?
	private StatCurve statCurve; // stat curves...
	private ArrayList<Stat> statSet;
	private int level; // ...with levels
	
	private final int MAX_LEVEL = 100;
	
	public Character(){
		name = "";
		gender = "";
		icon = null;
		
		element = null;
		inventory = null;
		statCurve = null;
		statSet = null;
		level = 0;
		
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
	public StatCurve getStatCurve(){
		return statCurve;
	}
	public ArrayList<Stat> getStats(){
		return statSet;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int lvl){
		if(lvl <= MAX_LEVEL){
			level = lvl;
		}
	}
	public void loadCharacter(){
		element = new Element();
		level = 1;
		inventory = new ItemCollection();
		statCurve = new StatCurve();
		statSet = new ArrayList<Stat>();
		
		if(element.getName() == "Air"){
			statSet = statCurve.loadAir();
		}
		else if(element.getName() == "Earth"){
			statSet = statCurve.loadEarth();
		}
		else if(element.getName() == "Fire"){
			statSet = statCurve.loadFire();
		}
		else if(element.getName() == "Lightning"){
			statSet = statCurve.loadLightning();
		}
		else if(element.getName() == "Water"){
			statSet = statCurve.loadWater();
		}
		else{
			statSet = null;
		}
	}
}

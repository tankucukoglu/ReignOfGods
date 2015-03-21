package characters;

import javax.swing.ImageIcon;

import components.Element;

public class Character{
	private String name;
	private String gender;
	
	private ImageIcon icon; // maybe?
	
	private Element element;
	
	public Character(){
		name = "";
		gender = "";
		
		icon = null;
		
		element = null;
		
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
	public void loadCharacter(){
		
	}
	
}

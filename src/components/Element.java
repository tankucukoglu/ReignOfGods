package components;

public class Element{
	
	private String name; // air, earth, fire, lightning, water
	private String description;	
	
	public Element(){
		name = "";
		description = "";
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
}

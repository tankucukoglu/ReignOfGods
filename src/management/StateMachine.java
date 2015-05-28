package management;

import java.util.ArrayList;

public class StateMachine{
	
	ArrayList<String> states = new ArrayList<String>();
	
	public StateMachine(){
		
		states.add("World Map");
		states.add("Local Map");
		states.add("Battle");
		states.add("Menu");
		// add more
	}
	
	public void updateState(float elapsedTime){
		
	}
	public void renderState(){
		
	}
	public void changeState(String stateName){
		if(stateName == states.get(0)){
			// world map
		}
		else if(stateName == states.get(1)){
			// local map
		}
		else if(stateName == states.get(2)){
			// battle
		}
		else if(stateName == states.get(3)){
			// menu
		}
			
	}
	public void onEnter(){
		
	}
	public void onExit(){
		
	}
	public void addState(String stateName){
		
		states.add(stateName);
	}
}

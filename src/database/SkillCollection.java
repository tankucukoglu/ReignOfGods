package database;

import java.util.ArrayList;

import components.Skill;

public class SkillCollection {
	private ArrayList<Skill> skills;
	
	public SkillCollection(){
		loadSkills();
	}
	public void loadSkills(){
		skills = new ArrayList<Skill>();
		
		
	}
	
}

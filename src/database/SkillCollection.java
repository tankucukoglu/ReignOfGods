package database;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import components.Skill;

public class SkillCollection {
	private ArrayList<Skill> skills;
	
	public SkillCollection(){
		loadSkills(); // load skills from file
	}
	public void loadSkills(){
		skills = new ArrayList<Skill>();
		
		BufferedReader buffer = null;
		
		try{
			buffer = new BufferedReader(new InputStreamReader(new FileInputStream("database/skills.dat"), "UTF-8"));

			String line = null;
			while((line = buffer.readLine()) != null){
				String[] tokens = line.split(" ");

				try{
					Skill s = new Skill();
					s.setName(tokens[0]); 
					s.setType(tokens[1]);
					s.setAOE(Integer.parseInt(tokens[2]));
					s.setMPCost(Integer.parseInt(tokens[3]));
					s.setAccu(Float.parseFloat(tokens[4]));
					s.setDmg(Double.parseDouble(tokens[5]));					
					// more skills properties to add here
					skills.add(s);
				}
				catch(Exception e){}
			}
		} 
		catch(IOException x){}
		finally{
			try{
				buffer.close();
			} 
			catch(Exception ex){}
		}
	}
	public ArrayList<Skill> getSkills(){
		return skills;
	}
}

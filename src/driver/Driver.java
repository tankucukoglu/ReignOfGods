package driver;

import java.util.ArrayList;

import components.Skill;
import database.SkillCollection;
import components.Item;
import database.ItemCollection;

public class Driver{

	public static void main(String[] args){
		
		// testing skills and items files
		
		SkillCollection skills = new SkillCollection();
		ItemCollection items = new ItemCollection();
		
		ArrayList<Skill> test = skills.getSkills();
		ArrayList<Item> test2 = items.getItems();
		
		for(int i = 0; i < test2.size(); i++){
			System.out.println(test2.get(i));
		}
		System.out.println();
		for(int i = 0; i < test.size(); i++){
			System.out.println(test.get(i));
		}
	}
}

package database;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import components.Item;
//import components.Skill;

public class ItemCollection {
	private ArrayList<Item> items;
	
	public ItemCollection(){
		loadItems();
	}
	public void loadItems(){
		items = new ArrayList<Item>();
		
		BufferedReader buffer = null;
			
		try{
			buffer = new BufferedReader(new InputStreamReader(new FileInputStream("database/items.dat"), "UTF-8"));
			String line = null;
			while((line = buffer.readLine()) != null){
				String[] tokens = line.split(" ");
	
				try{
					Item i = new Item();
					i.setName(tokens[0]); 
					i.setType(tokens[1]);					
					// more items properties to add here
					items.add(i);
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
	public ArrayList<Item> getItems(){
		return items;
	}
}

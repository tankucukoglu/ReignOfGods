package components;

public class Stat{
	private int healthPoints;
	private int magicPoints;
	private int attack;
	private int defense;
	private int magic;
	private int magicdef;
	private int agility;
	
	public Stat(){
		healthPoints = 0;
		magicPoints = 0;
		attack = 0;
		defense = 0;
		magic = 0;
		magicdef = 0;
		agility = 0;
	}
	public int getHP(){
		return healthPoints;
	}
	public void setHP(int hp){
		healthPoints = hp;
	}
	public int getMP(){
		return magicPoints;
	}
	public void setMP(int mp){
		magicPoints = mp;
	}
	public int getAtk(){
		return attack;
	}
	public void setAtk(int atk){
		attack = atk;
	}
	public int getDef(){
		return defense;
	}
	public void setDef(int def){
		defense = def;
	}
	public int getMagic(){
		return magic;
	}
	public void setMagic(int m){
		magic = m;
	}
	public int getMDef(){
		return magicdef;
	}
	public void setMDef(int mdef){
		magicdef = mdef;
	}
	public int getAgi(){
		return agility;
	}
	public void setAgi(int agi){
		agility = agi;
	}
}

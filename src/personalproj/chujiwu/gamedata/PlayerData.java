package personalproj.chujiwu.gamedata;

import java.io.Serializable;

import personalproj.chujiwu.env.GameDataEnums.Race;
import personalproj.chujiwu.env.GameDataEnums.Sex;

public class PlayerData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static PlayerData instance = new PlayerData();
	
	private String name = "";
	
	private Sex sex = Sex.MALE;
	
	private Race race = Race.HUMAN;
	
	private PlayerData(){
		
	}
	
	public static PlayerData getInstance(){
		if(instance == null){
			instance = new PlayerData();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}
	
	
}

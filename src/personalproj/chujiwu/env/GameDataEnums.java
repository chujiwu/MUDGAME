package personalproj.chujiwu.env;

public class GameDataEnums {
	
	public enum Sex{
		MALE(0), FEMALE(1);
		
		private int sex;
		
		private Sex(int sex){
			this.sex = sex;
		}
		
		public int getSex(){
			return sex;
		}
	}
	
	public enum Race{
		HUMAN(0), ELF(1), DWARF(2);
		
		private int race;
		
		private Race(int race){
			this.race = race;
		}
		
		public int getRace(){
			return race;
		}
		
	}

}
